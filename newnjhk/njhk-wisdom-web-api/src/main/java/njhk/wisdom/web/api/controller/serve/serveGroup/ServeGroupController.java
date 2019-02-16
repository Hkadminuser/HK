package njhk.wisdom.web.api.controller.serve.serveGroup;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.pojo.advice.AdviceType;
import njhk.wisdom.web.bean.entity.server.ServeGroup;
import njhk.wisdom.web.api.utils.WebUtils;
import njhk.wisdom.web.service.impl.serve.ServeGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Api(tags = "服务组信息接口")
@Controller
@RequestMapping(value = "/ServeGroup/info/*")
@Slf4j
public class ServeGroupController {
    @Autowired
    private ServeGroupService serveGroupService;


    /**
     *
     * 全查ServeGroup
     * */
    @ApiOperation(value = "全查ServeGroup", notes = "全查ServeGroup", produces = "application/json", response = ServeGroup.class)
    @RequestMapping(value = "findServeGroupList",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServeGroupList(
            HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            ServeGroup serveGroup
    ){
        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<ServeGroup> objectPage=new Page<ServeGroup>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));
        try {
            Page<ServeGroup> page=serveGroupService.findPage(objectPage,serveGroup);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);


        }

    }


    /**
     *
     * 根据ID单查ServeGroup
     * */
    @ApiOperation(value = "根据ID单查ServeGroup", notes = "根据ID单查ServeGroup", produces = "application/json", response = ServeGroup.class)
    @RequestMapping(value = "findServeGroupById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServeGroupById(HttpServletRequest request, HttpServletResponse response, String id){

        try {
            ServeGroup sg=serveGroupService.get(id);
            if (sg.toString().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(sg,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 新增ServeGroup
     * */
    @ApiOperation(value = "根据ID单查ServeGroup", notes = "根据ID单查ServeGroup", produces = "application/json", response = ServeGroup.class)
    @RequestMapping(value = "insertServeGroup",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> insertServeGroup(HttpServletRequest request, HttpServletResponse response, ServeGroup serveGroup){

        try {
            serveGroup.setR(1);
            serveGroupService.save(serveGroup);
           return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }

    }

    /**
     *
     * 修改ServeGroup
     * */
    @ApiOperation(value = "修改ServeGroup", notes = "修改ServeGroup", produces = "application/json", response = ServeGroup.class)
    @RequestMapping(value = "updateServeGroup",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateServeGroup(HttpServletRequest request, HttpServletResponse response, ServeGroup serveGroup){

        try {
            System.out.println(serveGroup.getServePersonsId()+"-----"+serveGroup.getOtherServePersonsId());
            serveGroupService.save(serveGroup);
            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }

    }

    /**
     *
     * 删除ServeGroup
     * */
    @ApiOperation(value = "删除ServeGroup", notes = "删除ServeGroup", produces = "application/json", response = ServeGroup.class)
    @RequestMapping(value = "deleteServeGroup",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> deleteServeGroup(HttpServletRequest request, HttpServletResponse response, ServeGroup serveGroup){

        try {
            serveGroupService.delete(serveGroup);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }
    }

}
