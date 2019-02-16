package njhk.wisdom.web.api.controller.volunteer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.common.utils.StringUtils;
import njhk.wisdom.web.bean.entity.server.ServeGroup;
import njhk.wisdom.web.bean.entity.server.VolunteerManagement;
import njhk.wisdom.web.api.utils.WebUtils;
import njhk.wisdom.web.service.impl.volunteer.VolunteerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Api(tags = "志愿者信息接口")
@Controller
@RequestMapping(value = "/VolunteerController/info/*")
@Slf4j
public class VolunteerController {
    @Autowired
    private VolunteerManagementService volunteerManagementService;

    /**
     *
     * 全查志愿者
     * */
    @ApiOperation(value = "全查志愿者", notes = "全查志愿者", produces = "application/json", response = VolunteerManagement.class)
    @RequestMapping(value = "findVolunteer",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findVolunteer(
            HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            VolunteerManagement volunteerManagement
    ){
        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<VolunteerManagement> objectPage=new Page<VolunteerManagement>(StringUtils.toInteger(pageNo),StringUtils.toInteger(pageSize));
        try {
            Page<VolunteerManagement> page=volunteerManagementService.findPage(objectPage,volunteerManagement);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应数据", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.NotSupport);

        }

    }

    /**
     *
     * 根据ID查志愿者
     * */
    @ApiOperation(value = "根据ID查志愿者", notes = "根据ID查志愿者", produces = "application/json", response = VolunteerManagement.class)
    @RequestMapping(value = "findVolunteerByID",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findVolunteerByID(HttpServletRequest request, HttpServletResponse response, String id)throws IOException{
        response.setContentType("text/html;charset=utf-8");
        try {
            VolunteerManagement v=volunteerManagementService.get(id);
            if (v.toString().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"查询失败",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(v,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }
    }

    /**
     *
     * 修改志愿者
     * */
    @ApiOperation(value = "修改志愿者", notes = "修改志愿者", produces = "application/json", response = VolunteerManagement.class)
    @RequestMapping(value = "updateVolunteer",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object> updateVolunteer(HttpServletRequest request, HttpServletResponse response, VolunteerManagement volunteerManagement){
        response.setContentType("text/html;charset=utf-8");
        try {
            volunteerManagementService.save(volunteerManagement);
            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }

    }

    /**
     *
     * 新增志愿者
     * */
    @ApiOperation(value = "新增志愿者", notes = "新增志愿者", produces = "application/json", response = VolunteerManagement.class)
    @RequestMapping(value = "insertVolunteer",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object> insertVolunteer(HttpServletRequest request, HttpServletResponse response, @RequestBody JSONObject volunteerManagement){
        VolunteerManagement vm = JSON.toJavaObject(volunteerManagement,VolunteerManagement.class);
        try {
            volunteerManagementService.save(vm);
            return HttpMessageUtils.getReturnMap(null,"新增成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"新增失败",HttpConstants.NotSupport);
        }

    }

    /**
     *
     * 删除志愿者
     * */
    @ApiOperation(value = "删除志愿者", notes = "删除志愿者", produces = "application/json", response = VolunteerManagement.class)
    @RequestMapping(value = "deleteVolunteer",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object> deleteVolunteer(HttpServletRequest request, HttpServletResponse response, VolunteerManagement v){
        response.setContentType("text/html;charset=utf-8");
        try {
            volunteerManagementService.delete(v);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }

    }

}
