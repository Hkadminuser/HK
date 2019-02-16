package njhk.wisdom.web.api.controller.advice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.pojo.advice.AdvicePgd;
import njhk.wisdom.web.bean.vo.AddressVo;
import njhk.wisdom.web.api.utils.WebUtils;
import njhk.wisdom.web.bean.vo.AdvicePgdVo;
import njhk.wisdom.web.service.impl.advice.AdvicePgdService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
@Api(tags = "咨询工单接口")
@Controller
@RequestMapping(value = "/advicepgd/info/*")
@Slf4j
public class AdvicepgdController {
    @Autowired
    private AdvicePgdService advicePgdService;

    /**
     *
     * 添加advicepgd
     * */
    @ApiOperation(value = "新增咨询工单", notes = "新增咨询工单", produces = "application/json", response = AdvicePgd.class)
    @RequestMapping(value = "insertAdvicepgd",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertAdvicepgd(HttpServletRequest request, HttpServletResponse response, AdvicePgdVo advicePgdVo)throws IOException {
        AdvicePgd advicePgd=new AdvicePgd();
        BeanUtils.copyProperties(advicePgdVo,advicePgd);
        try {
            advicePgdService.save(advicePgd);
            return  HttpMessageUtils.getReturnMap(null,"添加成功", HttpConstants.OK);

        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"添加失败", HttpConstants.NotSupport);
        }

    }

    /**
     *
     * 查询advicepgd
     * */
    @ApiOperation(value = "咨询工单列表", notes = "咨询工单列表", produces = "application/json", response = AdvicePgd.class)
    @RequestMapping(value = "findAdvicepgd",method = RequestMethod.POST)
    @ResponseBody
     public Map<String, Object>  findAdvicepgd(
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            AdvicePgdVo advicePgdVo
      )throws IOException{
        AdvicePgd advicePgd=new AdvicePgd();
        BeanUtils.copyProperties(advicePgdVo,advicePgd);
        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<AdvicePgd> objectPage=new Page<AdvicePgd>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));

        try {
            Page<AdvicePgd> page=advicePgdService.findPage(objectPage,advicePgd);
            if (page.getList().isEmpty()) {
                return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.OK);
            }
                return  HttpMessageUtils.getReturnMap(page,"查询咨询工单成功", HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常", HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 根据ID查advicepgd
     * */
    @ApiOperation(value = "根据ID查advicepgd", notes = "根据ID查advicepgd", produces = "application/json", response = AdvicePgd.class)
    @RequestMapping(value = "findAdvicepgdById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> findAdvicepgdById(HttpServletRequest request,HttpServletResponse response, AdvicePgdVo advicePgdVo)throws IOException{
        AdvicePgd aPgd=new AdvicePgd();
        BeanUtils.copyProperties(advicePgdVo,aPgd);
        try {
            AdvicePgd advicepgd=advicePgdService.get(aPgd);
            if(advicepgd==null){
                return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(advicepgd,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 修改advicepgd
     * */
    @ApiOperation(value = "修改advicepgd", notes = "修改advicepgd", produces = "application/json", response = AdvicePgd.class)
    @RequestMapping(value = "updateAdvicepgd",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updateAdvicepgd(HttpServletRequest request,HttpServletResponse response,AdvicePgdVo advicePgdVo)throws IOException{
        AdvicePgd advicePgd=new AdvicePgd();
        BeanUtils.copyProperties(advicePgdVo,advicePgd);
        try {
            advicePgdService.save(advicePgd);
            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }

    }

    /**
     *
     * 删除advicepgd
     * */
    @ApiOperation(value = "删除advicepgd", notes = "删除advicepgd", produces = "application/json", response = AdvicePgd.class)
    @RequestMapping(value = "deleteAdvicepgd",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> deleteAdvicepgd(HttpServletRequest request,HttpServletResponse response,AdvicePgdVo advicePgdVo)throws IOException{
        AdvicePgd advicePgd=new AdvicePgd();
        BeanUtils.copyProperties(advicePgdVo,advicePgd);
        try {
            advicePgdService.delete(advicePgd);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }
    }
}
