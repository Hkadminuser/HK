package njhk.wisdom.web.api.controller.serve;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.server.ServePerson;
import njhk.wisdom.web.bean.vo.ServePersonVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.serve.ServePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Api(tags = "服务人员信息查询接口")
@Controller
@RequestMapping(value = "/servePerson/info/*")
public class ServePersonController extends BaseController {
    @Autowired
    private ServePersonService servePersonService;

    /**
     * 获取会员地址列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "服务人员信息列表", notes = "服务人员信息列表", produces = "application/json", response = ServePersonVo.class)
    @RequestMapping(value = "/getServePersonByList", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getServePersonByList (
            @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
            @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
            @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
    {
        Page<ServePerson> objectPage = new Page<ServePerson>(pageNo, pageSize);
        Page<ServePersonVo> voObjectPage = new Page<ServePersonVo>(pageNo, pageSize);
        ServePerson object =new ServePerson();
        objectPage = servePersonService.findPage(objectPage, object);
        if (objectPage.getList().isEmpty()) {
            return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
        }
        List<ServePersonVo> voObjectList = new ArrayList<ServePersonVo>();
        for (ServePerson forObject : objectPage.getList()) {
            ServePersonVo voObject = new ServePersonVo();
            voObject.setId(forObject.getId());
            voObject.setIdCard(forObject.getIdCard());
            voObject.setAddress(forObject.getAddress());
            voObject.setAdvantage(forObject.getAdvantage());
            voObject.setAvgEstimate(forObject.getAvgEstimate());
            voObject.setAvailableTime(forObject.getAvailableTime());
            voObject.setBirthday(forObject.getBirthday());
            voObject.setEntryTime(forObject.getEntryTime());
            voObject.setFee(forObject.getFee());
            voObject.setFreeCount(forObject.getFreeCount());
            voObject.setWorkNo(forObject.getWorkNo());
            voObject.setEducationalBackground(forObject.getEducationalBackground());
            voObject.setTotalEstimate(forObject.getTotalEstimate());
            voObject.setFamilyPhone(forObject.getFamilyPhone());
            voObject.setLastPostionTime(forObject.getLastPostionTime());
            voObject.setStatSheQuId(forObject.getStatSheQuId());
            voObject.setMobilePhone(forObject.getMobilePhone());
            voObject.setLatitude(forObject.getLatitude());
            voObject.setLongitude(forObject.getLongitude());
            voObject.setNation(forObject.getNation());
            voObject.setNativePlace(forObject.getNativePlace());
            voObject.setNonUse(forObject.getNonUse());
            voObject.setSysEndCood(forObject.getSysEndCood());
            voObject.setServeType(forObject.getServeType());
            voObject.setLevel(forObject.getLevel());
            voObject.setLastSignTime(forObject.getLastSignTime());
            voObject.setServiceGroup(forObject.getServiceGroup());
            voObject.setPosition(forObject.getPosition());
            voObject.setPoints(forObject.getPoints());
            voObject.setPhotob(forObject.getPhotob());
            voObject.setWorkExperience(forObject.getWorkExperience());
            voObject.setFee(forObject.getFee());
            voObjectList.add(voObject);
        }
        if (voObjectList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
        }
        voObjectPage.setList(voObjectList);
        voObjectPage.setCount(objectPage.getCount());
        return HttpMessageUtils.getReturnMap(voObjectPage, "获取服务内容列表成功", HttpConstants.OK);
    }
    @ApiOperation(value = "修改服务人员信息", notes = "修改服务人员信息", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "/updateServePerson", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateServePerson(
            @ApiParam(required = false, name = "id", value = "产品id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "address", value = "地址信息") @RequestParam(value = "address", required = false) String address){
        ServePerson objectc =new ServePerson();
        objectc.setId(id);
        objectc.setAddress(address);
        try{
            servePersonService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务人员信息修改成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
    @ApiOperation(value = "增加服务人员信息", notes = "增加服务人员信息", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "/insertServePerson", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertServePerson(
            @ApiParam(required = false, name = "id", value = "产品id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "address", value = "地址信息") @RequestParam(value = "address", required = false) String address){
        ServePerson objectc =new ServePerson();
        objectc.setId(id);
        objectc.setAddress(address);
        try{
            servePersonService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务人员信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }
    }
    @ApiOperation(value = "删除服务人员信息", notes = "删除服务人员信息", produces = "application/json", response = ServePerson.class)
    @RequestMapping(value = "/deleteServePerson", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  deleteServePerson(
            @ApiParam(required = false, name = "id", value = "产品id") @RequestParam(value = "id", required = false) String id){
        ServePerson objectc =new ServePerson();
        objectc.setId(id);

        try{
            servePersonService.delete(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务人员信息删除成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
}
