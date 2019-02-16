/*
package njhk.wisdom.web.api.controller.device;

import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.DateUtils;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.device.Device;
import njhk.wisdom.web.bean.entity.device.DeviceGather;
import njhk.wisdom.web.bean.entity.device.DeviceMaintain;
import njhk.wisdom.web.bean.vo.DeviceIssueVo;
import njhk.wisdom.web.bean.vo.DeviceMaintainVo;
import njhk.wisdom.web.bean.vo.DeviceVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.DeviceGatherService;
import njhk.wisdom.web.service.impl.DeviceService;
import com.law.bean.common.constants.HttpConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

*/
/**
 * 设备接口
 *
 * @author xiangzhangshu
 * @version 2017-11-11
 *//*

@Api(tags = "设备故障报警接口")
@Controller
@RequestMapping(value = "/device/issue/*")
public class DeviceIssueController extends BaseController {
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private DeviceGatherService deviceGatherService;


	*/
/**
	 * 获取会员地址列表
	 * @param appUserCode
	 * @return
	 *//*

	@ApiOperation(value = "故障报警列表", notes = "故障报警列表", produces = "application/json", response = DeviceIssueVo.class)
	@RequestMapping(value = "/getIssueList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getIssueList(
			@ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
			@ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
			@ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "deviceCode", required = false) String deviceCode,
			@ApiParam(required = true, name = "appUserCode", value = "会员编号") @RequestParam(value = "appUserCode",required = true) String appUserCode) {
		Page<DeviceGather> objectPage = new Page<DeviceGather>(pageNo, pageSize);
		Page<DeviceIssueVo> voObjectPage = new Page<DeviceIssueVo>(pageNo, pageSize);
		DeviceGather object =new DeviceGather();
		object.setBreakStatus("1");
		object.setDeviceCode(deviceCode);
		objectPage =deviceGatherService.findPage(objectPage, object);
		if(objectPage.getList().isEmpty()){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		List<DeviceIssueVo> voObjectList =new ArrayList<DeviceIssueVo>();
		for(DeviceGather forObject : objectPage.getList()){
			DeviceIssueVo voObject =new DeviceIssueVo();
			voObject.setDeviceTime(forObject.getDeviceTime());
			voObject.setDeviceCode(forObject.getDeviceCode());
			voObject.setDeviceName("("+forObject.getDeviceLocat()+")"+forObject.getDeviceName());
			String issueDetail ="";
			String deviceLocat =forObject.getDeviceLocat();
			String deviceName  =forObject.getDeviceName();
			issueDetail =deviceName+"("+deviceLocat+")";
			voObject.setIssueDetail(issueDetail);
			voObjectList.add(voObject);
		}
		if(voObjectList.isEmpty()){
			return HttpMessageUtils.getReturnMap(voObjectPage,"无故障设备", HttpConstants.NotSupport);
		}
		voObjectPage.setList(voObjectList);
		voObjectPage.setCount(objectPage.getCount());
		return HttpMessageUtils.getReturnMap(voObjectPage,"获取故障报警列表成功", HttpConstants.OK);
	}

}
*/
