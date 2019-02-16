package njhk.wisdom.web.api.controller.serve;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.bean.entity.address.Address;
import njhk.wisdom.web.bean.vo.ServeStationVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.Address.AddressService;
import njhk.wisdom.web.service.impl.serve.ServeStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 设备接口
 *
 * @author chengsheng
 * @version 2017-11-11
 */
@Api(tags = "服务站信息查询接口")
@Controller
@RequestMapping(value = "/serveStation/info/*")
public class ServeStationController extends BaseController{
        @Autowired
        private ServeStationService serveStationService;
        @Autowired
        private AddressService addressService;
        /**
         * 获取会员地址列表
         *
         * @param
         * @return
         */
        @ApiOperation(value = "服务站信息列表", notes = "服务站信息列表", produces = "application/json", response = ServeStationVo.class)
        @RequestMapping(value = "/getServeStationInfo", method = RequestMethod.POST)
        @ResponseBody
        public Map<String, Object> getServeStationInfo(
                @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
                @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
                @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
        {
            Page<ServeStation> objectPage = new Page<ServeStation>(pageNo, pageSize);
            Page<ServeStationVo> voObjectPage = new Page<ServeStationVo>(pageNo, pageSize);
            ServeStation object =new ServeStation();
            Address address =new Address();
            List<Address> addressList= addressService.findAllList(address);
            Map<String, Address> addressMap = new HashMap<String,Address>();
            for(Address forObjecrt :addressList){
                String mapKey =forObjecrt.getId();
                addressMap.put(mapKey,forObjecrt);
            }
            objectPage = serveStationService.findPage(objectPage, object);
            if (objectPage.getList().isEmpty()) {
                return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
            }
            List<ServeStationVo> voObjectList = new ArrayList<ServeStationVo>();
            for (ServeStation forObject : objectPage.getList()) {
                ServeStationVo voObject = new ServeStationVo();
                voObject.setId(forObject.getId());
                voObject.setPhone(forObject.getPhone());
                voObject.setAddress(forObject.getAddress());
                voObject.setStatname(forObject.getStatname());
                voObject.setContact(forObject.getContact());
                voObject.setContactPhone(forObject.getContactPhone());
                voObject.setEqptNum(forObject.getEqptNum());
                voObject.setFirstAgent(forObject.getFirstAgent());
                voObject.setSecondAgent(forObject.getSecondAgent());
                voObject.setStatType(forObject.getStatType());
                voObject.setStatNum(forObject.getStatNum());
                voObject.setType(forObject.getType());
                Address address1 =new Address();
                Address address2 = new Address();
                Address address3 = new Address();
                if(forObject.getStatSheQuId()!=null){
                    address1=addressMap.get(forObject.getStatSheQuId());//社区
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
                voObjectList.add(voObject);
            }
            if (voObjectList.isEmpty()) {
                return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
            }
            voObjectPage.setList(voObjectList);
            voObjectPage.setCount(objectPage.getCount());
            return HttpMessageUtils.getReturnMap(voObjectPage, "获取服务站列表成功", HttpConstants.OK);
        }
    @ApiOperation(value = "修改服务站信息", notes = "修改服务站信息", produces = "application/json", response = ServeStation.class)
    @RequestMapping(value = "/updateServeStation", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateServeStation(
            @ApiParam(required = false, name = "id", value = "服务站id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "statname", value = "服务站信息名称") @RequestParam(value = "statname", required = false) String statname){
        ServeStation objectc =new ServeStation();
        objectc.setId(id);
        objectc.setStatname(statname);
        try{
            serveStationService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务站信息修改成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
    @ApiOperation(value = "增加服务站信息", notes = "增加服务站信息", produces = "application/json", response = ServeStation.class)
    @RequestMapping(value = "/insertServeStation", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertServeStation(
            @ApiParam(required = false, name = "id", value = "服务站id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "statname", value = "服务站信息名称") @RequestParam(value = "statname", required = false) String statname){
        ServeStation objectc =new ServeStation();
        objectc.setId(id);
        objectc.setStatname(statname);
        try{
            serveStationService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务站信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }
    }
    @ApiOperation(value = "删除服务站信息", notes = "删除服务站信息", produces = "application/json", response = ServeStation.class)
    @RequestMapping(value = "/deleteServeStation", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  deleteServeStation(
            @ApiParam(required = false, name = "id", value = "产品id") @RequestParam(value = "id", required = false) String id){
        ServeStation objectc =new ServeStation();
        objectc.setId(id);

        try{
            serveStationService.delete(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务站信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }


}
