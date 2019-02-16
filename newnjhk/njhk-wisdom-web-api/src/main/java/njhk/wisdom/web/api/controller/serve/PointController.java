package njhk.wisdom.web.api.controller.serve;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.server.Point;
import njhk.wisdom.web.bean.vo.PointVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.point.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Api(tags = "坐标信息查询接口")
@Controller
@RequestMapping(value = "/point/info/*")
public class PointController extends BaseController {
    @Autowired
    private PointService pointService;

    /**
     * 获取会员地址列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "坐标信息列表", notes = "坐标信息列表", produces = "application/json", response = PointVo.class)
    @RequestMapping(value = "/getPointByList", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getPointByList (
            @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
            @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id)
    {
        Page<Point> objectPage = new Page<Point>(pageNo, pageSize);
        Page<PointVo> voObjectPage = new Page<PointVo>(pageNo, pageSize);
        Point object =new Point();
        objectPage = pointService.findPage(objectPage, object);
        if (objectPage.getList().isEmpty()) {
            return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
        }
        List<PointVo> voObjectList = new ArrayList<PointVo>();
        for (Point forObject : objectPage.getList()) {
            PointVo voObject = new PointVo();
            voObject.setId(forObject.getId());
            voObject.setMobilePhone(forObject.getMobilePhone());
            voObject.setLatitude(forObject.getLatitude());
            voObject.setLongitude(forObject.getLongitude());

            voObjectList.add(voObject);
        }
        if (voObjectList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
        }
        voObjectPage.setList(voObjectList);
        voObjectPage.setCount(objectPage.getCount());
        return HttpMessageUtils.getReturnMap(voObjectPage, "获取坐标信息成功", HttpConstants.OK);
    }
    @ApiOperation(value = "修改坐标信息", notes = "修改坐标信息", produces = "application/json", response = Point.class)
    @RequestMapping(value = "/updatePoint", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updatePoint(
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "mobilePhone", value = "手机号码") @RequestParam(value = "mobilePhone", required = false) String mobilePhone){
        Point objectc =new Point();
        objectc.setId(id);
        objectc.setMobilePhone(mobilePhone);
        try{
            pointService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"坐标信息修改成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
    @ApiOperation(value = "增加坐标信息", notes = "增加坐标信息", produces = "application/json", response = Point.class)
    @RequestMapping(value = "/insertPoint", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertPoint(
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "mobilePhone", value = "手机号码") @RequestParam(value = "mobilePhone", required = false) String mobilePhone){
        Point objectc =new Point();
        objectc.setId(id);
        objectc.setMobilePhone(mobilePhone);
        try{
            pointService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"坐标信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }
    }
    @ApiOperation(value = "删除坐标信息", notes = "删除坐标信息", produces = "application/json", response = Point.class)
    @RequestMapping(value = "/deletePoint", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  deletePoint(
            @ApiParam(required = false, name = "id", value = "主键id") @RequestParam(value = "id", required = false) String id){
        Point objectc =new Point();
        objectc.setId(id);

        try{
            pointService.delete(objectc);

            return HttpMessageUtils.getReturnMap(null,"坐标信息删除成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
}
