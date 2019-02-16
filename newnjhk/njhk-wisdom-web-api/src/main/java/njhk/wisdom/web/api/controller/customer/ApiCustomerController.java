package njhk.wisdom.web.api.controller.customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.entity.address.Address;
import njhk.wisdom.web.bean.vo.CustomerVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.Address.AddressService;
import njhk.wisdom.web.service.impl.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 设备接口
 *
 * @author chengsheng
 * @version 2017-11-11
 */
@Api(tags = "老人信息查询接口")
@Controller
@RequestMapping(value = "/customer/info/*")
public class ApiCustomerController extends BaseController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AddressService addressService;
    /**
     * 获取会员地址列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "老人信息列表", notes = "老人信息列表", produces = "application/json", response = CustomerVo.class)
    @RequestMapping(value = "/getCustomerByList", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getCustomerByList (
            @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") String pageNo,
            @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") String pageSize,
            @ApiParam(required = false, name = "phone", value = "手机号码") @RequestParam(value = "phone", required = false) String  phone,
            @ApiParam(required = false, name = "name", value = "用户姓名") @RequestParam(value = "name", required = false) String name,
            @ApiParam(required = false, name = "type", value = "老人类别") @RequestParam(value = "type", required = false) String type)
    {
        Page<Customer> objectPage = new Page<Customer>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        Page<CustomerVo> voObjectPage = new Page<CustomerVo>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        Customer object =new Customer();
        object.setPhone(phone);
        object.setName(name);
        if(type!=null&&!"".equals(type)){
            object.setType(Integer.valueOf(type));
        }
        objectPage = customerService.findPage(objectPage, object);
        Address address =new Address();
        List<Address> addressList= addressService.findAllList(address);
        Map<String, Address> addressMap = new HashMap<String,Address>();
       for(Address forObjecrt :addressList){
           String mapKey =forObjecrt.getId();
           addressMap.put(mapKey,forObjecrt);
        }
        if (objectPage.getList().isEmpty()) {
            return HttpMessageUtils.getReturnMap(objectPage, "无对应记录", HttpConstants.NotSupport);
        }
        List<CustomerVo> voObjectList = new ArrayList<CustomerVo>();
        for (Customer forObject : objectPage.getList()) {
            CustomerVo voObject = new CustomerVo();
            voObject.setId(forObject.getId());
            voObject.setIdNumber(forObject.getIdNumber());
            voObject.setName(forObject.getName());
            voObject.setAge(forObject.getAge());
            voObject.setSex(forObject.getSex());
            voObject.setPhone(forObject.getPhone());
            Address address1 =new Address();
            Address address2 = new Address();
            Address address3 = new Address();
            if(forObject.getCommunityId()!=null){
                address1=addressMap.get(forObject.getCommunityId());//社区
            }
            if(address1.getParentId()!=null){
               address2 =addressMap.get(address1.getParentId());//街道
            }
            if(address2.getParentId()!=null) {
                address3 = addressMap.get(address2.getParentId());//区
            }
            voObject.setShequ(address1.getAddressName());
            voObject.setStreet(address2.getAddressName());
            voObject.setZone(address3.getAddressName());
            voObject.setMarriageStatus(forObject.getMarriageStatus());
            voObject.setMinzhengIndex(forObject.getMinzhengIndex());
            voObject.setOtherMinzhengIndex(forObject.getOtherMinzhengIndex());
            voObject.setDisease(forObject.getDisease());
            voObject.setDiseaseOther(forObject.getDiseaseOther());
            voObject.setLifeAreas(forObject.getLifeAreas());
            voObject.setIsDead(forObject.getIsDead());
            voObject.setJuzhuCommunity(forObject.getJuzhuCommunity());
            voObject.setAddress(forObject.getAddress());
            voObject.setBirthday(forObject.getBirthday());
            voObject.setCommunity(forObject.getCommunity());
            voObject.setCurrentAddress(forObject.getCurrentAddress());
            voObject.setDiseaseOther(forObject.getDiseaseOther());
            voObject.setEconomicSource(forObject.getEconomicSource());
            voObject.setAllergicType(forObject.getAllergicType());
            voObject.setBloodType(forObject.getBloodType());
            voObject.setType(forObject.getType());
            voObject.setOtherAllergicType(forObject.getOtherAllergicType());
            voObject.setPersonalHobby(forObject.getPersonalHobby());
            voObject.setSpecialCommunity(forObject.getSpecialCommunity());
            voObject.setStates(forObject.getStates());
            voObject.setTingCommunity(forObject.getTingCommunity());
            voObject.setOtherEconomicSource(forObject.getOtherEconomicSource());
            voObject.setOtherJuzhuCommunity(forObject.getOtherJuzhuCommunity());
            voObject.setMarriageStatus(forObject.getMarriageStatus());
            voObject.setPostTitle(forObject.getPostTitle());
            voObject.setEntrytime(forObject.getEntrytime());
            voObjectList.add(voObject);
        }
        if (voObjectList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
        }
        voObjectPage.setList(voObjectList);
        voObjectPage.setCount(objectPage.getCount());
        return HttpMessageUtils.getReturnMap(voObjectPage, "获取老人列表成功", HttpConstants.OK);
    }
    @ApiOperation(value = "修改老人信息列表", notes = "修改老人信息列表", produces = "application/json", response = Customer.class)
    @RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateCustomer(
            @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "name", value = "用户姓名") @RequestParam(value = "id", required = false) String name){
        Customer objectc =new Customer();
        objectc.setName(name);
        try{
            customerService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"老人信息修改成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
    @ApiOperation(value = "老人信息列表", notes = "增加老人信息", produces = "application/json", response = Customer.class)
    @RequestMapping(value = "/insertCustomer", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertCustomer(
            @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "name", value = "用户姓名") @RequestParam(value = "id", required = false) String name){
        Customer objectc =new Customer();
        objectc.setId(id);
        objectc.setName(name);
        try{
            customerService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"老人信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }
    }
        @ApiOperation(value = "删除老人信息", notes = "删除老人信息", produces = "application/json", response = Customer.class)
        @RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
        @ResponseBody
        public Map<String, Object>  deleteCustomer(
                @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id,
                @ApiParam(required = false, name = "states", value = "用户状态") @RequestParam(value = "id", required = false) Integer states){
            Customer objectc =new Customer();
            objectc.setId(id);
            objectc.setStates(states);

            try{
                customerService.delete(objectc);

                return HttpMessageUtils.getReturnMap(null,"老人信息新增成功", HttpConstants.OK);
            }catch (Exception e){
                return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
            }

    }
}
