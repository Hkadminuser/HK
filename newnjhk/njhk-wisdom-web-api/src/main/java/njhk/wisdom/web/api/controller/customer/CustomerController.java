package njhk.wisdom.web.api.controller.customer;

import njhk.wisdom.web.bean.common.persistence.Page;

import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.vo.CustomerVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.customer.WebCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * 顾客Controller
 *
 * @author wk
 * @version 2018-12-18
 */
@Controller
@RequestMapping(value = "/Customer/info/*")
public class CustomerController extends BaseController {
    @Autowired
    private WebCustomerService customerService;

    @RequestMapping(value = "/insertCustomer", method = RequestMethod.POST)
    @ResponseBody
    public void insertCustomer(
            @RequestParam("idNumber") String idNumber,
            @RequestParam("phone") String phone,
            @RequestParam("name") String name,
            @RequestParam("sex") String sex,
            @RequestParam("age") String age
    ){



    }

    @RequestMapping(value = "/findCustomer")
    @ResponseBody
    public void findCustomer(
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            @RequestParam(value = "name", required = false) String name,//姓名
            @RequestParam(value = "phone", required = false) String phone,//电话
            @RequestParam(value = "idNumber", required = false) String idNumber,//身份证号
            @RequestParam(value = "states", required = false) Integer states,//服务状态
            @RequestParam(value = "lifeAreas", required = false) String lifeAreas,//生活区域
            @RequestParam(value = "marriageStatus", required = false) String marriageStatus,//婚姻状态
            @RequestParam(value = "disease", required = false) String disease,//健康状态
            @RequestParam(value = "minzhengIndex", required = false) String minzhengIndex,//老人类别
            @RequestParam(value = "specialCommunity", required = false) String specialCommunity,//特殊群体
            @RequestParam(value = "sex", required = false) String sex,//性别
            @RequestParam(value = "age", required = false) String age,//年龄
            @RequestParam(value = "address", required = false) String address,//市
            @RequestParam(value = "zone", required = false) String zone,//区
            @RequestParam(value = "street", required = false) String street,//街道
            @RequestParam(value = "shequ", required = false) String shequ,//社区
            @RequestParam(value = "community", required = false) String community,//详细地址
            @RequestParam(value = "entrytime", required = false) Date entrytime,//登记时间
            @RequestParam(value = "zhuxiaotime", required = false) Date zhuxiaotime,//注销时间
            @RequestParam(value = "isFreedate", required = false) Date isFreedate,//实体取消时间
            @RequestParam(value = "isDeaddate", required = false) Date isDeaddate,//信息取消时间
            @RequestParam(value = "visitLevel", required = false) Integer visitLevel,//回访需求
            @RequestParam(value = "status", required = false) Integer status,//审核状态
            @RequestParam(value = "fromApp", required = false) Integer fromApp//来源
    ){
        Page<Customer> objectPage = new Page<Customer>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        Page<Customer> voObjectPage = new Page<Customer>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        Customer object=new Customer();
        object.setName(name);
        object.setPhone(phone);
        object.setIdNumber(idNumber);
        object.setStates(states);
        object.setLifeAreas(lifeAreas);
        object.setMarriageStatus(marriageStatus);
        object.setDisease(disease);
        object.setMinzhengIndex(minzhengIndex);
        object.setSpecialCommunity(specialCommunity);
        object.setSex(sex);
        object.setAge(age);
        object.setAddress(address);
        object.setZone(zone);
        object.setStreet(street);
        object.setShequ(shequ);
        object.setCommunity(community);
        object.setEntrytime(entrytime);
        object.setZhuXiaoTime(zhuxiaotime);
        object.setIsFreeDate(isFreedate);
        object.setIsDeadDate(isDeaddate);
        object.setVisitLevel(visitLevel);
        object.setStatus(status);
        object.setFromApp(fromApp);

        objectPage = customerService.findPage(objectPage, object);

        System.out.println("-------------!!!!!!!!!!!!!!!!!");

    }


}
