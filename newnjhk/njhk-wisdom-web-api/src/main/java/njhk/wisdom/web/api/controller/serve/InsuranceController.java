package njhk.wisdom.web.api.controller.serve;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.other.Insurance;
import njhk.wisdom.web.bean.vo.InsuranceVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.insurance.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(tags = "保险信息查询接口")
@Controller
@RequestMapping(value = "/insurance/info/*")
public class InsuranceController extends BaseController {
    @Autowired
    private InsuranceService insuranceService;

    /**
     * 获取会员地址列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "保险信息列表", notes = "保险信息列表", produces = "application/json", response = InsuranceVo.class)
    @RequestMapping(value = "/getInsuranceByList", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getInsuranceByList (
            @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
            @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id)
    {
        Page<Insurance> objectPage = new Page<Insurance>(pageNo, pageSize);
        Page<InsuranceVo> voObjectPage = new Page<InsuranceVo>(pageNo, pageSize);
        Insurance object =new Insurance();
        objectPage = insuranceService.findPage(objectPage, object);
        if (objectPage.getList().isEmpty()) {
            return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
        }
        List<InsuranceVo> voObjectList = new ArrayList<InsuranceVo>();
        for (Insurance forObject : objectPage.getList()) {
            InsuranceVo voObject = new InsuranceVo();
            voObject.setId(forObject.getId());
            voObject.setCreateTime(forObject.getCreateTime());
            voObject.setName(forObject.getName());
            voObject.setMap(forObject.getMap());
            voObject.setDes(forObject.getDes());
            voObject.setPoints(forObject.getPoints());
            voObjectList.add(voObject);
        }
        if (voObjectList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
        }
        voObjectPage.setList(voObjectList);
        voObjectPage.setCount(objectPage.getCount());
        return HttpMessageUtils.getReturnMap(voObjectPage, "获取保险信息成功", HttpConstants.OK);
    }
    @ApiOperation(value = "修改保险信息", notes = "修改保险信息", produces = "application/json", response = Insurance.class)
    @RequestMapping(value = "/updateInsurance", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateInsurance(
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "points", value = "价格") @RequestParam(value = "points", required = false) Integer points){
        Insurance objectc =new Insurance();
        objectc.setId(id);
        objectc.setPoints(points);
        try{
            insuranceService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"保险信息修改成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
    @ApiOperation(value = "增加保险信息", notes = "增加保险信息", produces = "application/json", response = Insurance.class)
    @RequestMapping(value = "/insertInsurance", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertInsurance(
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "points", value = "价格") @RequestParam(value = "points", required = false) Integer points){
        Insurance objectc =new Insurance();
        objectc.setId(id);
        objectc.setPoints(points);
        try{
            insuranceService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"保险信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }
    }
    @ApiOperation(value = "删除保险信息", notes = "删除保险信息", produces = "application/json", response = Insurance.class)
    @RequestMapping(value = "/deleteInsurance", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  deleteInsurance(
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id){
        Insurance objectc =new Insurance();
        objectc.setId(id);

        try{
            insuranceService.delete(objectc);

            return HttpMessageUtils.getReturnMap(null,"保险信息删除成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
}
