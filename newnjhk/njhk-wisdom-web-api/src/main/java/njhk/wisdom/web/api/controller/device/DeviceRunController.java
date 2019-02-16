/*
package njhk.wisdom.web.api.controller.device;

import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.DateUtil;
import njhk.wisdom.web.bean.common.utils.DateUtils;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.common.utils.StringUtils;
import njhk.wisdom.web.bean.entity.device.Device;
import njhk.wisdom.web.bean.entity.device.DeviceGather;
import njhk.wisdom.web.bean.entity.device.DeviceMaintain;
import njhk.wisdom.web.bean.vo.DeviceMaintainVo;
import njhk.wisdom.web.bean.vo.DeviceRunVo;
import njhk.wisdom.web.bean.vo.DeviceVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.DeviceGatherService;
import njhk.wisdom.web.service.impl.DeviceMaintainService;
import njhk.wisdom.web.service.impl.DeviceService;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

*/
/**
 * 设备接口
 * 
 * @author xiangzhangshu
 * @version 2017-11-11
 *//*

@Api(tags = "设备运行分析接口")
@Controller
@RequestMapping(value = "/device/run/*")
public class DeviceRunController extends BaseController {
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private DeviceGatherService deviceGatherService;


	*/
/**
	* 设备维护保养接口
	* @return
	*//*

	@ApiOperation(value = "获取运行分析模块设备列表", notes = "获取运行分析模块设备列表", produces = "application/json", response = DeviceRunVo.class)
	@RequestMapping(value = "/getRunDeviceList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getRunDeviceList(
			@ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
			@ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
			@ApiParam(required = true, name = "appUserCode", value = "会员编号") @RequestParam(value = "appUserCode",required = true) String appUserCode) {
		Page<Device> objectPage = new Page<Device>(pageNo, pageSize);
		Page<DeviceRunVo> voObjectPage = new Page<DeviceRunVo>(pageNo, pageSize);
		Device object = new Device();
		objectPage = deviceService.findPage(objectPage, object);
		if (objectPage.getList().isEmpty()) {
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		List<DeviceRunVo> voObjectList = new ArrayList<DeviceRunVo>();
		for (Device forObject : objectPage.getList()) {
			String deviceTypeCode =forObject.getDeviceTypeCode();
			if("DT154096793520102".equals(deviceTypeCode)){
				DeviceRunVo voObject = new DeviceRunVo();
				voObject.setDeviceCode(forObject.getDeviceCode());
				voObject.setDeviceName("("+forObject.getDeviceLocat()+")"+forObject.getDeviceName());
				voObjectList.add(voObject);
			}
		}
		voObjectPage.setList(voObjectList);
		voObjectPage.setCount(objectPage.getCount());
		return HttpMessageUtils.getReturnMap(voObjectPage, "获取设备列表成功", HttpConstants.OK);
	}
	*/
/**
	 * 获取填报记录列表
	 * @return
	 *//*

	@ApiOperation(value = "获取设备运行数据", notes = "获取维护保养列表", produces = "application/json", response = DeviceRunVo.class)
	@RequestMapping(value = "/getDeviceRunDate", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getDeviceMaintainList(
			@ApiParam(required = true, name = "dataDay", value = "设备运行检索日期") @RequestParam(value = "dataDay",required = true) String dataDay,
			@ApiParam(required = true, name = "deviceCode", value = "设备编号") @RequestParam(value = "deviceCode",required = true) String deviceCode)
	{
		List<DeviceRunVo> objectList = new ArrayList<DeviceRunVo>();
		DeviceGather object =new DeviceGather();
		object.setDeviceCode(deviceCode);
		object.setDeviceTime(DateUtil.str2Date(dataDay,"yyyy-MM-dd"));
		List<DeviceGather> deviceGatherList = deviceGatherService.findList(object);
		if(deviceGatherList.isEmpty()){
			object =new DeviceGather();
			object.setDeviceCode(deviceCode);
			deviceGatherList = deviceGatherService.findList(object);
			Collections.sort(deviceGatherList, new Comparator<DeviceGather>(){
				*/
/*
				 * int compare(Person p1, Person p2) 返回一个基本类型的整型，
				 * 返回负数表示：p1 小于p2，
				 * 返回0 表示：p1和p2相等，
				 * 返回正数表示：p1大于p2
				 *//*

				@Override
				public int compare(DeviceGather p1, DeviceGather p2) {
					if (Integer.parseInt(p1.getId())> Integer.parseInt(p2.getId())) {
						return -1;
					}
					if (Integer.parseInt(p1.getId())== Integer.parseInt(p2.getId())) {
						return 0;
					}
					return 1;
				}
			});
			DeviceGather forObject = deviceGatherList.get(0);
			DeviceRunVo deviceRunVo =new DeviceRunVo();
			deviceRunVo.setDeviceCode(forObject.getDeviceCode());
			deviceRunVo.setDeviceName(forObject.getDeviceName());
			deviceRunVo.setDeviceTime(new Date());
			deviceRunVo.setRunFlag(forObject.getRunStatus());
			objectList.add(deviceRunVo);
			return HttpMessageUtils.getReturnMap(objectList,"获取设备运行数据列表", HttpConstants.OK);
		}
		for(DeviceGather forObject : deviceGatherList){
			DeviceRunVo deviceRunVo =new DeviceRunVo();
			deviceRunVo.setDeviceCode(forObject.getDeviceCode());
			deviceRunVo.setDeviceName(forObject.getDeviceName());
			deviceRunVo.setDeviceTime(forObject.getDeviceTime());
			deviceRunVo.setRunFlag(forObject.getRunStatus());
			objectList.add(deviceRunVo);
		}
		return HttpMessageUtils.getReturnMap(objectList,"获取设备运行数据列表", HttpConstants.OK);
	}

}*/
