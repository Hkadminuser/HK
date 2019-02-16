package njhk.wisdom.web.api.controller.serve.servePerson;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.relevance.ServetypeServeperson;
import njhk.wisdom.web.bean.entity.resources.Syuser;
import njhk.wisdom.web.bean.entity.server.ServePerson;
import njhk.wisdom.web.service.impl.account.SyuserService;
import njhk.wisdom.web.service.impl.serve.ServePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * 服务人员Controller
 *
 * @author wk
 * @version 2018-12-25
 */
@Api(tags = "服务人员信息接口")
@Controller
@RequestMapping(value = "/WebServeperson/info/*")
@Slf4j
public class WebServepersonController {

    @Autowired
    private  ServePersonService  servePersonService;
    @Autowired
    private SyuserService syuserService;

    @ApiOperation(value = "增加服务人员信息", notes = "增加服务人员信息", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "/insertServePerson", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertServePerson(ServePerson servePerson){
          Syuser user=new Syuser();
          user.setLoginname(servePerson.getLoginName());
          user.setAge(servePerson.getAge());
          user.setSex(servePerson.getSex());
          user.setName(servePerson.getName());
          user.setCreatedatetime(new Date());

        try {
            syuserService.save(user);

        if(servePerson.getShiID()!=null && !"".equals(servePerson.getShiID())){
               servePerson.setServiceStation(servePerson.getShiID());
          }
        if(servePerson.getQuID()!=null && !"".equals(servePerson.getQuID())){
            servePerson.setServiceStation(servePerson.getQuID());
        }
        if(servePerson.getJiedaoID()!=null && !"".equals(servePerson.getJiedaoID())){
            servePerson.setServiceStation(servePerson.getJiedaoID());
        }
        if(servePerson.getShequID()!=null && !"".equals(servePerson.getShequID())){
            servePerson.setServiceStation(servePerson.getShequID());
        }
           servePerson.setId(user.getId());
         servePersonService.insert(servePerson);
         return HttpMessageUtils.getReturnMap(null,"服务人员信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }

    /**
     *
     * 单查询Serveperson
     * */
    @ApiOperation(value = "单查询Serveperson", notes = "单查询Serveperson", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "/getServeperson",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getServeperson(
            @RequestParam(value = "id",required = false) String id,
            HttpServletResponse response
    ) {

        try {
            ServePerson sp=servePersonService.get(id);
            if (sp==null){
                return HttpMessageUtils.getReturnMap(null,"无对应数据", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(sp,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }

    }

    /**
     *
     * 查询Serveperson
     * */
    @ApiOperation(value = "查询Serveperson", notes = "查询Serveperson", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "/findServeperson",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServeperson(
          @RequestParam(value = "pageNo", required = false) String pageNo,//页号
          @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
          ServePerson servePerson,
          HttpServletResponse response
    )throws IOException{

        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<ServePerson> objectPage=new Page<ServePerson>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));
        try {
            Page<ServePerson> page=servePersonService.findPage(objectPage,servePerson);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应数据",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }


    }

    /**
     *
     * 修改Serveperson
     * */
    @ApiOperation(value = "修改Serveperson", notes = "修改Serveperson", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "updateServeperson",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object> updateServeperson(HttpServletRequest request, HttpServletResponse response, ServePerson servePerson){
        Syuser user=new Syuser();
        user.setId(servePerson.getId());
        user.setLoginname(servePerson.getLoginName());
        user.setAge(servePerson.getAge());
        user.setSex(servePerson.getSex());
        user.setName(servePerson.getName());
        try {
            syuserService.save(user);
            servePersonService.save(servePerson);
            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }


    /**
     *
     * 停用Serveperson
     * */
    @ApiOperation(value = "修改Serveperson", notes = "修改Serveperson", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "stopServeperson",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  stopServeperson(HttpServletRequest request, HttpServletResponse response, ServePerson servePerson)throws IOException{

        try {
            servePersonService.stopServeperson(servePerson);
            return HttpMessageUtils.getReturnMap(null,"停用成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"停用失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 修改Serveperson技能
     * */
    @ApiOperation(value = "修改Serveperson技能", notes = "修改Serveperson技能", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "updateSkill",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateSkill(HttpServletRequest request, HttpServletResponse response, String[] servetype_id, String serveperson_id){

        try {
            servePersonService.deleteServetypeServeperson(serveperson_id);
            List<ServetypeServeperson> list=new ArrayList<>();
            for (int i = 0; i <servetype_id.length ; i++) {
                ServetypeServeperson ss=new ServetypeServeperson();
                ss.setServeperson_id(serveperson_id);
                ss.setServetype_id(servetype_id[i]);
                list.add(ss);
            }
            servePersonService.saveServetypeServeperson(list);
            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }


    /**
     *
     * 删除Serveperson
     * */
    @ApiOperation(value = "删除Serveperson", notes = "删除Serveperson", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "deleteServeperson",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  deleteServeperson(HttpServletRequest request, HttpServletResponse response, ServePerson servePerson){

        try {
            servePersonService.delete(servePerson);
           return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }
    }


}
