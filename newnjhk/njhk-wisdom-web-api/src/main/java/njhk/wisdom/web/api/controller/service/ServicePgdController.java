package njhk.wisdom.web.api.controller.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.BaseEntity;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.entity.server.ServiceStates;
import njhk.wisdom.web.bean.entity.relevance.WxServicepgdServeperson;
import njhk.wisdom.web.bean.entity.server.*;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.service.ServicePgdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 设备接口
 *
 * @author chengsheng
 * @version 2017-11-11
 */
@Api(tags = "工单信息接口")
@Controller
@RequestMapping(value = "/servicePgd/info/*")
@Slf4j
public class ServicePgdController extends BaseController {
    @Autowired
    private ServicePgdService servicePgdService;


    /**
     *
     * 添加Servicepgd
     * */
    @ApiOperation(value = "添加Servicepgd", notes = "添加Servicepgd", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "insertServicepgd",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> insertServicepgd(HttpServletRequest request, HttpServletResponse response,ServicePgd servicePgd){
                SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
                String orderNum = "FW" + format.format(new Date());
                String OrderNum=servicePgdService.findeOrderNumByOrderNum(orderNum);
                String tempCount = "0000";
            if (OrderNum != null) {
                Integer tempInt = Integer.parseInt(OrderNum.substring(10));
                tempInt = tempInt + 1;
                tempCount = tempCount + tempInt.toString();
                tempCount = tempCount.substring(tempCount.length() - 4);
              } else {
                tempCount = "0001";
              }
            String ONum=orderNum+tempCount;
            servicePgd.setOrderNum(ONum);
            servicePgd.setCreateTime(new Date());
            servicePgd.setAppStates(1);
            servicePgd.setStates(0);
            servicePgd.setEstimateLevel("0");


        try {
            servicePgdService.save(servicePgd);
            return HttpMessageUtils.getReturnMap(null,"新增成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"新增失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 根据ServepersonID查询所属的工单
     * */
    @ApiOperation(value = "根据ServepersonID查询所属的工单", notes = "根据ServepersonID查询所属的工单", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "findServicepgdByServepersonID",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  findServicepgdByServepersonID(HttpServletRequest request, HttpServletResponse response, WxServicepgdServeperson wss) {

        try {
            List<ServicePgd> list=servicePgdService.findServicepgdByServepersonID(wss);
            if (list.isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应数据",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(list,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }
    }

    /**
     *
     * 查询工单
     * */
    @ApiOperation(value = "查询工单", notes = "查询工单", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "findServicepgd",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  findServicepgd(
            HttpServletRequest request,HttpServletResponse response,
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            ServicePgd servicePgd
            ){

        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<ServicePgd> objectPage=new Page<ServicePgd>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));
        Page<ServicePgd> page=servicePgdService.findPage(objectPage,servicePgd);
        try {
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
     * 单查工单
     * */
    @ApiOperation(value = "单查工单", notes = "单查工单", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "findServicepgdById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServicepgdById(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            ServicePgd Pgd=servicePgdService.get(servicePgd);
            if (Pgd.toString().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(Pgd,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 修改Servicepgd
     * */
    @ApiOperation(value = "修改Servicepgd", notes = "修改Servicepgd", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "updateServicepgd",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  updateServicepgdScrap(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgdService.save(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 派发
     * */
    @ApiOperation(value = "派发", notes = "派发", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "Distribute",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  Distribute(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        servicePgd.setDistributeTime(new Date());
        servicePgdService.Distribute(servicePgd);
        try {

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 申请作废
     * */
    @ApiOperation(value = "申请作废", notes = "申请作废", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "Invalid",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  Invalid(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgd.setAskCloseTime(new Date());
            servicePgdService.Invalid(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 作废
     * */
    @ApiOperation(value = "作废", notes = "作废", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "End",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  End(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgd.setCloseTime(new Date());
            servicePgdService.End(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 处理
     * */
    @ApiOperation(value = "处理", notes = "处理", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "Handle",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  Handle(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgd.setDoneTime(new Date());
            servicePgdService.Handle(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 撤回
     * */
    @ApiOperation(value = "撤回", notes = "撤回", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "withdraw",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  withdraw(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        Integer states=null;
        if(servicePgd.getStates()==1){
            states=0;
            servicePgd.setAppStates(1);
        }
        if(servicePgd.getStates()==2){
            states=1;
        }
        if(servicePgd.getStates()==3){
            states=2;
        }
        if(servicePgd.getStates()==4){
            states=0;
        }
        try {
            servicePgd.setStates(states);
            servicePgdService.withdraw(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 回访
     * */
    @ApiOperation(value = "回访", notes = "回访", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "Visit",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  Visit(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgd.setCallTime(new Date());
            servicePgdService.Visit(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 开始工作
     * */
    @ApiOperation(value = "开始工作", notes = "开始工作", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "start",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  start(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgd.setTimeStart(new Date());
            servicePgdService.start(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 结束工作
     * */
    @ApiOperation(value = "结束工作", notes = "结束工作", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "over",method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object>  over(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgd.setTimeEnd(new Date());
            servicePgdService.over(servicePgd);

            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 删除Servicepgd
     * */
    @ApiOperation(value = "删除Servicepgd", notes = "删除Servicepgd", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "deleteServicepgd",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> deleteServicepgd(HttpServletRequest request, HttpServletResponse response, ServicePgd servicePgd){
            servicePgd.setDelFlag(BaseEntity.DEL_FLAG_DELETE);
        try {
            servicePgdService.delete(servicePgd);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }
    }

    /* *
     *
     * 批量删除
     * */
    @ApiOperation(value = "批量删除", notes = "批量删除", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "batchDeleteServicepgd",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchDeleteServicepgd(HttpServletResponse response, ServicePgd servicePgd){


        try {
            servicePgdService.batchDeleteServicepgd(servicePgd);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 批量撤回
     * */
    @ApiOperation(value = "批量撤回", notes = "批量撤回", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "batchWithdraw",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchWithdraw(HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgdService.batchWithdraw(servicePgd);
            return HttpMessageUtils.getReturnMap(null,"撤回成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"撤回失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 批量处理
     * */
    @ApiOperation(value = "批量处理", notes = "批量处理", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "batchHandle",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchHandle(HttpServletResponse response, ServicePgd servicePgd){

         try {
             servicePgdService.batchHandle(servicePgd);
             return HttpMessageUtils.getReturnMap(null,"处理成功",HttpConstants.OK);
         } catch (Exception e) {
             log.error("系统异常=====>"+e.getMessage());
             return HttpMessageUtils.getReturnMap(e.getMessage(),"处理失败",HttpConstants.NotSupport);
         }
     }

    /**
     *
     * 批量回访
     * */
    @ApiOperation(value = "批量回访", notes = "批量回访", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "batchReturnVisit",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchReturnVisit(HttpServletResponse response, ServicePgd servicePgd){

         try {
             servicePgdService.batchReturnVisit(servicePgd);
             return HttpMessageUtils.getReturnMap(null,"回访成功",HttpConstants.OK);
         } catch (Exception e) {
             log.error("系统异常=====>"+e.getMessage());
             return HttpMessageUtils.getReturnMap(e.getMessage(),"回访失败",HttpConstants.NotSupport);
         }
     }

    /**
     *
     * 批量作废
     * */
    @ApiOperation(value = "批量作废", notes = "批量作废", produces = "application/json", response = ServicePgd.class)
    @RequestMapping(value = "batchToVoid",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchToVoid(HttpServletResponse response, ServicePgd servicePgd){

        try {
            servicePgdService.batchToVoid(servicePgd);
            return HttpMessageUtils.getReturnMap(null,"作废成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"作废失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 工单状态统计
     * */
    @ApiOperation(value = "工单状态统计", notes = "工单状态统计", produces = "application/json", response = ServiceStates.class)
    @RequestMapping(value = "findServicePgdStates",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServicePgdStates(HttpServletRequest request, HttpServletResponse response
    )throws IOException{

        try {
            List<ServiceStates> pgd=servicePgdService.findServicePgdStates();
            List<ServiceStates> serviceStatesList=new ArrayList<ServiceStates>();
            for(ServiceStates serviceStates: pgd){

                String states=serviceStates.getStates();
                if(states.equals("0")){
                    states="待派发";
                    serviceStates.setStates(states);
                }else if(states.equals("1")){
                    states="待处理";
                    serviceStates.setStates(states);
                }else if(states.equals("2")){
                    states="待回访";
                    serviceStates.setStates(states);
                }else if(states.equals("3")){
                    states="已完成";
                    serviceStates.setStates(states);
                }else if(states.equals("4")){
                    states="待作废";
                    serviceStates.setStates(states);
                }else{
                    states="已作废";
                    serviceStates.setStates(states);
                }
                serviceStates.getOrderNumbers();
                serviceStatesList.add(serviceStates);
            }

            if (serviceStatesList.isEmpty()) {
                return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(serviceStatesList, "获取工单状态统计成功", HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.NotSupport);


        }

    }


}
