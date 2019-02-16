package njhk.wisdom.web.api.controller.customer.webcustomer;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.entity.customer.CustomerStates;
import njhk.wisdom.web.bean.entity.customer.CustomerTypes;
import njhk.wisdom.web.bean.entity.server.VolunteerManagement;
import njhk.wisdom.web.api.utils.WebUtils;
import njhk.wisdom.web.bean.vo.CustomerVo;
import njhk.wisdom.web.bean.vo.WebCustomer;
import njhk.wisdom.web.service.impl.customer.WebCustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 顾客Controller
 *
 * @author wk
 * @version 2018-12-18
 */
@Api(tags = "服务对象信息接口")
@Controller
@RequestMapping(value = "/WebCustomer/info/*")
@Slf4j
public class WebCustomerController {

    @Autowired
    private WebCustomerService customerService;


    /**
     * 新增Customer
     * **/
    @ApiOperation(value = "新增Customer", notes = "新增Customer", produces = "application/json", response = WebCustomer.class)
    @RequestMapping(value = "/insertCustomer",method = RequestMethod.POST)
    @ResponseBody
    @JsonIgnoreProperties
    public Map<String, Object> insertCustomer(HttpServletRequest request, HttpServletResponse response,@RequestBody JSONObject object){ ;
        Customer customer = JSON.toJavaObject(object,Customer.class);
       // BeanUtils.copyProperties(webCustomer,customer);
        try {
            customerService.save(customer);
            return HttpMessageUtils.getReturnMap(null,"新增成功", HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"新增失败",HttpConstants.NotSupport);
        }
    }

    /**
     * 修改Customer
     * **/
    @ApiOperation(value = "修改Customer", notes = "修改Customer", produces = "application/json", response = WebCustomer.class)
    @RequestMapping(value = "updateCustomer",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> updateCustomer(HttpServletRequest request, HttpServletResponse response,@RequestBody JSONObject object)throws IOException{
        //Customer customer=new Customer();
        Customer customer = JSON.toJavaObject(object,Customer.class);
        //BeanUtils.copyProperties(webCustomer,customer);
        try {
            customerService.save(customer);
            return HttpMessageUtils.getReturnMap(null,"修改成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"修改失败",HttpConstants.NotSupport);
        }

    }


    /**
     * 根据ID查询
     * **/
    @ApiOperation(value = "根据ID查询", notes = "根据ID查询", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/getCustomer",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getCustomer(
            @RequestParam(value = "id",required = false) String id,
            HttpServletResponse response
    ){
        try {
            Customer customer=customerService.get(id);
            //customer.getEc().getJtcy_name3();
            if (customer.toString()==null){
                return HttpMessageUtils.getReturnMap(null,"无对应数据",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(customer,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }


    }

   /**
    *
    * 查询Customer
    * */
   @ApiOperation(value = "查询Customer", notes = "查询Customer", produces = "application/json", response = CustomerVo.class)
   @RequestMapping(value = "/findCustomer",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findCustomer(
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            WebCustomer webCustomer
    ){
       Customer customer=new Customer();
       BeanUtils.copyProperties(webCustomer,customer);
        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            if (customer.getSuiji()==null||"".equals(customer.getSuiji())){
                pageSize="50";
            }else{
                pageSize=customer.getSuiji().toString();
            }
        }

            Page<Customer> objectPage = new Page<Customer>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
       try {
           Page<Customer> page=customerService.findPage(objectPage,customer);
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
     * 删除Customer
     * **/
    @ApiOperation(value = "删除Customer", notes = "删除Customer", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/deleteCustomer",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> deleteCustomer(
            @RequestParam(value = "id")String id,
            HttpServletResponse response
    ){
        response.setContentType("text/html;charset=utf-8");
        Customer c=new Customer();
        c.setId(id);
        try {
            customerService.delete(c);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }

    }

    /**
     * 注销
     * **/
    @ApiOperation(value = "注销Customer", notes = "注销Customer", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/updateZhuxiao",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> updateZhuxiao(
            HttpServletResponse response,WebCustomer webCustomer
    ){

        CustomerVo customerVo=new CustomerVo();
        BeanUtils.copyProperties(webCustomer,customerVo);
        try {
            customerService.updateZhuxiao(customerVo);
            return HttpMessageUtils.getReturnMap(null,"注销成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"注销失败",HttpConstants.NotSupport);
        }
    }


    /**
     * 签约
     * **/
    @ApiOperation(value = "签约Customer", notes = "签约Customer", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/updateQianyue",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> updateQianyue(
            HttpServletResponse response,HttpServletRequest request,
            WebCustomer webCustomer
    ){

        CustomerVo customerVo=new CustomerVo();
        BeanUtils.copyProperties(webCustomer,customerVo);
        try {
            customerService.updateQianyue(customerVo);
            return HttpMessageUtils.getReturnMap(null,"签约成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"签约失败",HttpConstants.NotSupport);
        }
    }

   /**
    * 批量删除
    * **/
   @ApiOperation(value = "批量删除Customer", notes = "批量删除Customer", produces = "application/json", response = CustomerVo.class)
   @RequestMapping(value = "/batchdeleteCustomer",method = RequestMethod.POST)
    @ResponseBody
  public Map<String, Object> batchDeleteCustomer(
          HttpServletResponse response,String[]  id
    ){

       CustomerVo customerVo=new CustomerVo();
       customerVo.setArray(id);
        try {
            customerService.batchDelete(customerVo);
            return HttpMessageUtils.getReturnMap(null,"删除成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"删除失败",HttpConstants.NotSupport);
        }

    }

    /**
     * 批量注销
     * **/
    @ApiOperation(value = "批量注销Customer", notes = "批量注销Customer", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/batchUpdateZhuxiao",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchUpdateZhuxiao(
            HttpServletResponse response,String[] id
    ){
        CustomerVo customerVo=new CustomerVo();
        customerVo.setArray(id);
        try {
            customerService.batchUpdateZhuxiao(customerVo);
            return HttpMessageUtils.getReturnMap(null,"注销成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"注销失败",HttpConstants.NotSupport);
        }
    }


    /**
     * 批量签约
     * **/
    @ApiOperation(value = "批量签约Customer", notes = "批量签约Customer", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/batchUpdateQianyue",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchUpdateQianyue(
            HttpServletResponse response,HttpServletRequest request,
            String[] id
    ){
        CustomerVo customerVo=new CustomerVo();
        customerVo.setArray(id);
        try {
            customerService.batchUpdateQianyue(customerVo);
            return HttpMessageUtils.getReturnMap(null,"签约成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"签约失败",HttpConstants.NotSupport);
        }
    }

    /**
     * 批量审核
     * **/
    @ApiOperation(value = "批量审核Customer", notes = "批量审核Customer", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/batchUpdateShenhe",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> batchUpdateShenhe(HttpServletResponse response, String[] id){

        CustomerVo customerVo=new CustomerVo();
        customerVo.setArray(id);
        try {
            customerService.batchUpdateShenhe(customerVo);
            return HttpMessageUtils.getReturnMap(null,"审核成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"审核失败",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 用户类型统计
     * */
    @ApiOperation(value = "用户类型统计", notes = "用户类型统计", produces = "application/json", response = CustomerTypes.class)
    @RequestMapping(value = "/findCustomerType", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> findCustomerType()throws IOException{
        CustomerTypes customerTypes =new CustomerTypes();
        try {
            List<CustomerTypes> pgd = customerService.findCustomerType();
            List<CustomerTypes> customerTypesList=new ArrayList<CustomerTypes>();
            for( CustomerTypes customerType : pgd){

                String types=customerType.getTypes();
                if(types.equals("1")){
                    types="普通客户";
                    customerType.setTypes(types);
                }else if(types.equals("2")){
                    types="安康宝客户";
                    customerType.setTypes(types);
                }else if(types.equals("3")){
                    types="残联客户";
                    customerType.setTypes(types);
                }else if(types.equals("4")){
                    types="老干部客户";
                    customerType.setTypes(types);
                }
                else if(types.equals("5")){
                    types="计生委客户";
                    customerType.setTypes(types);
                }
                else if(types.equals("6")){
                    types="援助客户";
                    customerType.setTypes(types);
                }
                else if(types.equals("7")){
                    types="商业客户";
                    customerType.setTypes(types);
                }
                else if(types.equals("8")){
                    types="D类服务客户";
                    customerType.setTypes(types);
                }
                customerType.getCustomerTypes();
                customerTypesList.add(customerType);
            }
            if (customerTypesList.isEmpty()) {
                return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(customerTypesList, "获取用户类型统计成功", HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.NotSupport);

        }

    }


    /**
     *
     * 用户状态统计
     * */
    @ApiOperation(value = "用户状态统计", notes = "用户状态统计", produces = "application/json", response = CustomerStates.class)
    @RequestMapping(value = "/findCustomerStates", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findCustomerStates()throws IOException {
        CustomerStates customerStates = new CustomerStates();
        try {
            List<CustomerStates> pgd = customerService.findCustomerStates();
            List<CustomerStates> customerStatesList=new ArrayList<CustomerStates>();
            for( CustomerStates customerSta : pgd){

                String states=customerSta.getStates();
                if(states.equals("1")){
                    states="待签约";
                    customerSta.setStates(states);
                }else if(states.equals("2")){
                    states="在用";
                    customerSta.setStates(states);
                }else if(states.equals("3")){
                    states="停用";
                    customerSta.setStates(states);
                }else if(states.equals("4")){
                    states="注销";
                    customerSta.setStates(states);
                }
                customerSta.getCustomerNumbers();
                customerStatesList.add(customerSta);
            }
            if (customerStatesList.isEmpty()) {
                return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(customerStatesList, "获取老人列表成功", HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.NotSupport);

        }

    }






}
