/*
package njhk.wisdom.web.api.controller.device;

import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.DateUtil;
import njhk.wisdom.web.bean.common.utils.DateUtils;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.common.utils.StringUtils;
import njhk.wisdom.web.bean.entity.device.Device;
import njhk.wisdom.web.bean.entity.device.DeviceMaintain;
import njhk.wisdom.web.bean.vo.DeviceMaintainVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.DeviceMaintainService;
import njhk.wisdom.web.service.impl.DeviceService;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@Api(tags = "设备维护保养接口")
@Controller
@RequestMapping(value = "/device/maintain/*")
public class DeviceMaintainController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(DeviceMaintainController.class);
	@Autowired
	private DeviceMaintainService deviceMaintainService;
	@Autowired
	private DeviceService deviceService;


	*/
/**
	* 设备维护保养接口
	* @return
	*//*

	@ApiOperation(value = "新增维护保养接口", notes = "新增维护保养接口", produces = "application/json", response = DeviceMaintain.class)
	@RequestMapping(value = "/addDeviceMaintain", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addDeviceMaintain(
			@ApiParam(required = true, name = "appUserCode", value = "app用户编号") @RequestParam(value = "appUserCode",required = true) String appUserCode,
			@ApiParam(required = true, name = "fomrTime", value = "保养时间") @RequestParam(value = "fomrTime", required = true) String fomrTime,
			@ApiParam(required = true, name = "formInputName", value = "保养人") @RequestParam(value = "formInputName", required = true) String formInputName,
			@ApiParam(required = true, name = "deviceCode", value = "设备编号") @RequestParam(value = "deviceCode",required = true) String deviceCode,
			@ApiParam(required = true, name = "deviceName", value = "设备名称") @RequestParam(value = "deviceName",required = true) String deviceName,
			@ApiParam(required = true, name = "formDesc", value = "事件描述") @RequestParam(value = "formDesc",required = true) String formDesc)
	{
		try{
			logger.info("送参时间："+fomrTime);
			Device device =new Device();
			device.setDeviceCode(deviceCode);
			device =deviceService.get(device);
			if(device==null){
				return HttpMessageUtils.getReturnMap(null, "对应设备不存在", HttpConstants.NotSupport);
			}
			DeviceMaintain object =new DeviceMaintain();
			object.setFormCode(StringUtils.getSeriesId("M"));
			object.setAppUserCode(appUserCode);
			object.setLastMaintainTime(DateUtil.str2Date(fomrTime));
			object.setFormDesc(formDesc);
			object.setFormInputName(formInputName);
			object.setDeviceCode(deviceCode);
			object.setDeviceName(deviceName);
			device.setLastMaintainTime(object.getLastMaintainTime());
			deviceMaintainService.saveMaintain(object,device);
			return HttpMessageUtils.getReturnMap(object,"提交成功",HttpConstants.OK);
		}catch (Exception e){
			e.printStackTrace();
			return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.Error);
		}
	}
	*/
/**
	 * 获取填报记录列表
	 * @return
	 *//*

	@ApiOperation(value = "获取维护保养列表", notes = "获取维护保养列表", produces = "application/json", response = DeviceMaintainVo.class)
	@RequestMapping(value = "/getDeviceMaintainList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getDeviceMaintainList(
			@ApiParam(required = true, name = "appUserCode", value = "app用户编号") @RequestParam(value = "appUserCode", required = true) String appUserCode,
			@ApiParam(required = false, name = "deviceCode", value = "设备编号") @RequestParam(value = "deviceCode", required = false) String deviceCode,
			@ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
			@ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize
	)
	{
		Page<DeviceMaintain> objectPage = new Page<DeviceMaintain>(pageNo, pageSize);
		Page<DeviceMaintainVo> voObjectPage = new Page<DeviceMaintainVo>(pageNo, pageSize);
		DeviceMaintain object =new DeviceMaintain();
		object.setDeviceCode(deviceCode);
		objectPage =deviceMaintainService.findPage(objectPage, object);
		if(objectPage.getList().isEmpty()){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		List<DeviceMaintainVo> voObjectList =new ArrayList<DeviceMaintainVo>();
		for(DeviceMaintain forObject : objectPage.getList()){
			DeviceMaintainVo voObject =new DeviceMaintainVo();
			voObject.setAppUserCode(forObject.getAppUserCode());
			voObject.setAppUserName(forObject.getAppUserName());
			voObject.setFormDesc(forObject.getFormDesc());
			voObject.setFormInputName(forObject.getFormInputName());
			voObject.setFormTime(forObject.getFormTime());
			voObject.setLastMaintainTime(forObject.getLastMaintainTime());
			voObject.setDeviceCode(forObject.getDeviceCode());
			voObject.setDeviceName(forObject.getDeviceName());
			if(forObject.getLastRunLength()==null||"".equals(forObject.getLastRunLength())){
				Date before = new Date();
				if(forObject.getLastMaintainTime()!=null){
					before =forObject.getLastMaintainTime();
				}
				Double runTimeLength = DateUtils.getDistanceOfTwoDateByMinute(before,new Date());
				voObject.setRunTimeLength(runTimeLength);
			}
			if(forObject.getLastRunLength()!=null&&!"".equals(forObject.getLastRunLength())){
				voObject.setRunTimeLength(new Double(forObject.getLastRunLength()));
			}
			voObjectList.add(voObject);
		}
		voObjectPage.setList(voObjectList);
		voObjectPage.setCount(objectPage.getCount());
		return HttpMessageUtils.getReturnMap(voObjectPage,"获取维护保养列表成功", HttpConstants.OK);
	}

	*/
/**
	 * 获取填报记录详情
	 * @return
	 *//*

	@ApiOperation(value = "获取填报记录详情", notes = "获取填报记录详情", produces = "application/json", response = DeviceMaintainVo.class)
	@RequestMapping(value = "/getDeviceMaintainInfo", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getDeviceMaintainInfo(
			@ApiParam(required = true, name = "formCode", value = "保养记录编号") @RequestParam(value = "formCode") String formCode
	)
	{
		DeviceMaintain object =new DeviceMaintain();
		object.setFormCode(formCode);
		object =deviceMaintainService.get(object);
		if(object==null){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		DeviceMaintainVo voObject =new DeviceMaintainVo();
		voObject.setAppUserCode(object.getAppUserCode());
		voObject.setAppUserName(object.getAppUserName());
		voObject.setFormDesc(object.getFormDesc());
		voObject.setFormInputName(object.getFormInputName());
		voObject.setFormTime(object.getFormTime());
		Date lastMaintainTime = object.getLastMaintainTime();
		voObject.setLastMaintainTime(lastMaintainTime);
		if(object.getLastRunLength()==null||"".equals(object.getLastRunLength())){
			Date before = new Date();
			if(object.getLastMaintainTime()!=null){
				before =object.getLastMaintainTime();
			}
			Double runTimeLength = DateUtils.getDistanceOfTwoDateByMinute(before,new Date());
			voObject.setRunTimeLength(runTimeLength);
		}
		if(object.getLastRunLength()!=null&&!"".equals(object.getLastRunLength())){
			voObject.setRunTimeLength(new Double(object.getLastRunLength()));
		}
		voObject.setDeviceCode(object.getDeviceCode());
		voObject.setDeviceName(object.getDeviceName());
		return HttpMessageUtils.getReturnMap(voObject,"获取维护保养详情成功", HttpConstants.OK);
	}

}*/
