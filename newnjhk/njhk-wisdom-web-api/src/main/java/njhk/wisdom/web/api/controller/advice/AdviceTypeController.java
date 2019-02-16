package njhk.wisdom.web.api.controller.advice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.pojo.advice.AdvicePgd;
import njhk.wisdom.web.bean.entity.pojo.advice.AdviceType;
import njhk.wisdom.web.api.utils.WebUtils;
import njhk.wisdom.web.service.impl.advice.AdviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
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

@Api(tags = "咨询类别接口")
@Controller
@RequestMapping(value = "/adviceType/info/*")
@Slf4j
public class AdviceTypeController {
    @Autowired
    private AdviceTypeService adviceTypeService;

    /*
     * 新增adviceType
     */
    @ApiOperation(value = "新增咨询类别", notes = "新增咨询类别", produces = "application/json", response = AdviceType.class)
    @RequestMapping(value = "insertAdviceType",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertAdviceType(HttpServletRequest request, HttpServletResponse response, AdviceType aType)throws IOException{

        try {
            adviceTypeService.save(aType);
            return HttpMessageUtils.getReturnMap(null,"新增成功", HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"新增失败", HttpConstants.NotSupport);

        }
    }
    /*
     * 查询adviceType
     */
    @ApiOperation(value = "查询adviceType", notes = "查询adviceType", produces = "application/json", response = AdviceType.class)
    @RequestMapping(value = "findAdviceType",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findAdviceType(
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            HttpServletRequest request, HttpServletResponse response,AdviceType adviceType)
    {
             Page<AdviceType> objpage=new Page<AdviceType>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));
        try {
            Page<AdviceType> page=adviceTypeService.findPage(objpage,adviceType);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);
        }
    }

    /*
     * 单查adviceType
     */
    @ApiOperation(value = "单查adviceType", notes = "单查adviceType", produces = "application/json", response = AdviceType.class)
    @RequestMapping(value = "findAdviceTypeById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> findAdviceTypeById(HttpServletRequest request,HttpServletResponse response,String id){

        try {
            AdviceType advicetype=adviceTypeService.get(id);
            if (advicetype.toString().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应数据",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(advicetype,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }
    }

    /*
     * 修改adviceType
     */
    @ApiOperation(value = "修改adviceType", notes = "修改adviceType", produces = "application/json", response = AdviceType.class)
    @RequestMapping(value = "updateAdviceType",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> updateAdviceType(HttpServletRequest request, HttpServletResponse response, AdviceType atype){

        try {
            adviceTypeService.save(atype);
            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }

    }

    /*
     * 删除adviceType
     */
    @ApiOperation(value = "删除adviceType", notes = "删除adviceType", produces = "application/json", response = AdviceType.class)
    @RequestMapping(value = "deleteAdviceType",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> deleteAdviceType(HttpServletRequest request, HttpServletResponse response, AdviceType adviceType){

        try {
            adviceTypeService.delete(adviceType);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }
    }


}
