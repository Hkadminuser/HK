package njhk.wisdom.web.api.controller.serve;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;

import njhk.wisdom.web.bean.entity.pojo.customer.EntityCustomer;
import njhk.wisdom.web.bean.vo.EntityCustomerVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.customer.EntityCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 设备接口
 *
 * @author chengsheng
 * @version 2017-11-11
 */
@Api(tags = "服务对象新增信息查询接口")
@Controller
@RequestMapping(value = "/entitycustomer/info/*")
public class EntitycustomerController extends BaseController {
    @Autowired
    private EntityCustomerService entityCustomerService;

    /**
     * 获取服务对象新增信息列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "服务对象新增信息", notes = "服务对象新增信息", produces = "application/json", response = EntityCustomerVo.class)
    @RequestMapping(value = "/getEntitycustomer", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getEntitycustomer(
            @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
            @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
            @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
    {
        Page<EntityCustomer> objectPage = new Page<EntityCustomer>(pageNo, pageSize);
        Page<EntityCustomerVo> voObjectPage = new Page<EntityCustomerVo>(pageNo, pageSize);
        EntityCustomer object =new EntityCustomer();
        objectPage = entityCustomerService.findPage(objectPage, object);
        if (objectPage.getList().isEmpty()) {
            return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
        }
        List<EntityCustomerVo> voObjectList = new ArrayList<EntityCustomerVo>();
        for (EntityCustomer forObject : objectPage.getList()) {
            EntityCustomerVo voObject = new EntityCustomerVo();
                    voObject.setID(forObject.getID());
                    voObject.setBalance(forObject.getBalance());
                    voObject.setBatch(forObject.getBatch());
                    voObject.setGuidangtime(forObject.getGuidangtime());
                    voObject.setIsdisability(forObject.getIsdisability());
                    voObject.setIsguidang(forObject.getIsguidang());
                    voObject.setIslow(forObject.getIslow());
                    voObject.setIsspecial(forObject.getIsspecial());
                    voObject.setJtcy_address1(forObject.getJtcyaddress1());
                    voObject.setJtcy_address2(forObject.getJtcyaddress2());
                    voObject.setJtcy_name1(forObject.getJtcyname1());
                    voObject.setJtcy_name2(forObject.getJtcyname2());
                    voObject.setJtcy_phone1(forObject.getJtcyphone1());
                    voObject.setJtcy_phone2(forObject.getJtcyphone2());
                    voObject.setJtcy_relation1(forObject.getJtcyrelation1());
                    voObject.setJtcy_relation2(forObject.getJtcyrelation2());
                    voObject.setJtlx(forObject.getJtlx());
                    voObject.setNewphone(forObject.getNewphone());
                    voObject.setRemark(forObject.getRemark());
                    voObject.setSubamount(forObject.getSubamount());
                    voObject.setSubtype(forObject.getSubtype());
                    voObject.setCustomer(forObject.getCustomer());
                    voObject.setIschegnshisanwu(forObject.getIschegnshisanwu());
                    voObject.setIsnongcunwubao(forObject.getIsnongcunwubao());
                    voObject.setDesiredService(forObject.getDesiredService());
                    voObject.setGovernment(forObject.getGovernment());
                    voObject.setGovernmentTarget(forObject.getGovernmentTarget());
                    voObject.setJtcy_address3(forObject.getJtcyaddress3());
                    voObject.setJtcy_age3(forObject.getJtcyage3());
                    voObject.setJtcy_byphone1(forObject.getJtcybyphone1());
                    voObject.setJtcy_byphone2(forObject.getJtcybyphone2());
                    voObject.setJtcy_idNumber3(forObject.getJtcyidNumber3());
                    voObject.setJtcy_location3(forObject.getJtcylocation3());
                    voObject.setJtcy_name3(forObject.getJtcyname3());
                    voObject.setJtcy_nation3(forObject.getJtcynation3());
                    voObject.setJtcy_phone3(forObject.getJtcyphone3());
                    voObject.setJtcy_relation3(forObject.getJtcyrelation3());
                    voObject.setJtcy_sex1(forObject.getJtcysex1());
                    voObject.setJtcy_sex2(forObject.getJtcysex2());
                    voObject.setJtcy_sex3(forObject.getJtcysex3());
                    voObject.setOtherPattern(forObject.getOtherPattern());
                    voObject.setPattern(forObject.getPattern());
                    voObject.setTarget(forObject.getTarget());
                    voObjectList.add(voObject);
        }
        if (voObjectList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
        }
        voObjectPage.setList(voObjectList);
        voObjectPage.setCount(objectPage.getCount());
        return HttpMessageUtils.getReturnMap(voObjectPage, "获取服务对象新增信息成功", HttpConstants.OK);
    }


    /**
     * 修改服务对象新增信息信息
     *
     * @param
     * @return
     */

    @ApiOperation(value = "修改服务对象新增信息信息列表", notes = "修改服务对象新增信息信息列表", produces = "application/json", response = EntityCustomer.class)
    @RequestMapping(value = "/updateEntitycustomer", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updateEntitycustomer(
            @ApiParam(required = false, name = "jtcy_name1", value = "参数一") @RequestParam(value = "jtcy_name1", required = false) String jtcy_name1,
            @ApiParam(required = false, name = "jtcy_name2", value = "参数二") @RequestParam(value = "jtcy_name2", required = false) String jtcy_name2,
            @ApiParam(required = false, name = "jtcy_name3", value = "参数三") @RequestParam(value = "jtcy_name3", required = false) String jtcy_name3)
    {
        EntityCustomer objects=new EntityCustomer();
        objects.setJtcyname1(jtcy_name1);
        objects.setJtcyname2(jtcy_name2);
        objects.setJtcyname3(jtcy_name3);

        try {
            entityCustomerService.save(objects);
            return  HttpMessageUtils.getReturnMap(null,"服务对象新增信息更新成功", HttpConstants.OK);
        } catch (Exception e) {
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.OK);

        }
    }


    /**
     * 增加服务对象新增信息信息
     *
     * @param
     * @return
     */
    @ApiOperation(value = "增加服务对象新增信息", notes = "增加服务对象新增信息", produces = "application/json", response = EntityCustomer.class)
    @RequestMapping(value = "/insertEntitycustomer", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertEntitycustomer(
            @ApiParam(required = false, name = "jtcy_name1", value = "参数一") @RequestParam(value = "jtcy_name1", required = false) String jtcy_name1,
            @ApiParam(required = false, name = "jtcy_name2", value = "参数二") @RequestParam(value = "jtcy_name2", required = false) String jtcy_name2,
            @ApiParam(required = false, name = "jtcy_name3", value = "参数三") @RequestParam(value = "jtcy_name3", required = false) String jtcy_name3)
    {
        EntityCustomer objects=new EntityCustomer();
        objects.setJtcyname1(jtcy_name1);
        objects.setJtcyname2(jtcy_name2);
        objects.setJtcyname3(jtcy_name3);
        try {
            entityCustomerService.save(objects);
            return  HttpMessageUtils.getReturnMap(null,"服务对象新增信息增加成功",HttpConstants.OK);
        } catch (Exception e) {
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.OK);

        }
    }



    /**
     * 删除服务对象新增信息
     *
     * @param
     * @return
     */
    @ApiOperation(value = "删除服务对象新增信息", notes = "删除服务对象新增信息", produces = "application/json", response = EntityCustomer.class)
    @RequestMapping(value = "/deleteEntitycustomer", method = RequestMethod.POST)
    @ResponseBody

    public Map<String,Object> deleteEntitycustomer( @ApiParam(
            required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
    {
        EntityCustomer objects=new EntityCustomer();
        objects.setId(id);

        try {
            entityCustomerService.delete(objects);
            return  HttpMessageUtils.getReturnMap(null,"服务对象新增信息删除成功",HttpConstants.OK);
        } catch (Exception e) {
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.OK);

        }
    }



}
