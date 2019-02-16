/*
package njhk.wisdom.web.api.controller.device;

import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;

import njhk.wisdom.web.bean.vo.DeviceVo;
import njhk.wisdom.web.api.config.BaseController;

import njhk.wisdom.web.service.impl.DeviceDtuService;
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

import java.util.*;

*/
/**
 * 设备接口
 * 
 * @author xiangzhangshu
 * @version 2017-11-11
 *//*

@Api(tags = "设备状态接口")
@Controller
@RequestMapping(value = "/device/info/*")
public class DeviceController extends BaseController {

	private final Logger logger = LoggerFactory.getLogger(DeviceController.class);
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private DeviceDtuService deviceDtuService;
	@Autowired
	private SocketHandle socketHandle;
	*/
/**
	 * 获取会员地址列表
	 * @param appUserCode
	 * @return
	 *//*

	@ApiOperation(value = "设备列表", notes = "设备列表", produces = "application/json", response = DeviceVo.class)
	@RequestMapping(value = "/getDeviceList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getDeviceList(
			@ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
			@ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
			@ApiParam(required = true, name = "appUserCode", value = "会员编号") @RequestParam(value = "appUserCode",required = true) String appUserCode) {
		Page<Device> objectPage = new Page<Device>(pageNo, pageSize);
		Page<DeviceVo> voObjectPage = new Page<DeviceVo>(pageNo, pageSize);
		Device object =new Device();
		DeviceDtu deviceDtu =new DeviceDtu();
		deviceDtu.setId("1");
		deviceDtu =deviceDtuService.get(deviceDtu);
		if(deviceDtu==null){
			return HttpMessageUtils.getReturnMap(null, "DTU设备信息异常", HttpConstants.NotSupport);
		}
		String  dtuStatus =deviceDtu.getDtuStatus();
		objectPage =deviceService.findPage(objectPage, object);
		if(objectPage.getList().isEmpty()){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		List<DeviceVo> voObjectList =new ArrayList<DeviceVo>();
		List<String> dtuCodeList =new ArrayList<String>();
		for(Device forObject : objectPage.getList()){
			String deviceTypeCode =forObject.getDeviceTypeCode();
			DeviceVo voObject =new DeviceVo();
			voObject.setDeviceCode(forObject.getDeviceCode());
			voObject.setDeviceLocat(forObject.getDeviceLocat());
			voObject.setDeviceName(forObject.getDeviceName());
			String manualStatus ="" ;
			if("1".equals(dtuStatus)){
				voObject.setManualStatus(manualStatus);
			}else{
				if(forObject.getManualStatus()!=null){
					manualStatus =forObject.getManualStatus();
					if(manualStatus.split("-").length>2){
						voObject.setManualStatus(manualStatus.split("-")[2]);
					}
				}
			}
			if("DT154096795567549".equals(deviceTypeCode)){
				String ballStaus ="";
				if("1".equals(dtuStatus)){
					voObject.setRunStatus(ballStaus);
				}else{
					if(forObject.getBallStaus()!=null){
						ballStaus =forObject.getBallStaus();
						if(ballStaus.split("-").length>2){
							String ballStausValue =ballStaus.split("-")[2];
							if("0".equals(ballStausValue)){
								voObject.setRunStatus("4");
							}else if("1".equals(ballStausValue)){
								voObject.setRunStatus("3");
							}else{
								voObject.setRunStatus("");
							}
						}
					}
				}
			}else{
				String runStatus ="" ;
				if("1".equals(dtuStatus)){
					voObject.setRunStatus(runStatus);
				}else{
					if(forObject.getRunStatus()!=null){
						runStatus =forObject.getRunStatus();
						if(runStatus.split("-").length>2){
							String runStatusValue = runStatus.split("-")[2];
							if(runStatusValue.equals("1")){
								voObject.setRunStatus("0");
							}
							if(runStatusValue.equals("0")){
								String breakStatus ="" ;
								if(forObject.getBreakStatus()!=null){
									breakStatus =forObject.getBreakStatus();
									if(breakStatus.split("-").length>2){
										String breakStatusValue = breakStatus.split("-")[2];
										if(breakStatusValue.equals("1")){
											voObject.setRunStatus("1");
										}else{
											voObject.setRunStatus("2");
										}
									}
								}else{
									voObject.setRunStatus("2");
								}
							}
						}
					}
				}
			}
			voObjectList.add(voObject);
			String dtuCode  =forObject.getDeviceDtuCode();
			if(!dtuCodeList.contains(dtuCode)){
				dtuCodeList.add(dtuCode);
			}
		}
		voObjectPage.setList(voObjectList);
		voObjectPage.setCount(objectPage.getCount());
		Map<String ,Object> returnMap =new HashMap<String,Object>();
		returnMap.put("dtuStatus",dtuStatus);
		returnMap.put("voObjectPage",voObjectPage);
		return HttpMessageUtils.getReturnMap(returnMap,"获取设备列表成功", HttpConstants.OK);
	}


	*/
/**
	 * 设备详情
	 * @param deviceCode
	 * @return
	 *//*

	@ApiOperation(value = "设备详情", notes = "设备详情", produces = "application/json", response = DeviceVo.class)
	@RequestMapping(value = "/getDeviceInfo", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getDeviceInfo(
			@ApiParam(required = true, name = "deviceCode", value = "设备编号") @RequestParam(value = "deviceCode",required = true) String deviceCode) {
		Device object = new Device();
		object.setDeviceCode(deviceCode);
		object = deviceService.get(object);
		if(object==null){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		DeviceVo voObject =new DeviceVo();
		voObject.setDeviceCode(object.getDeviceCode());
		voObject.setDeviceLocat(object.getDeviceLocat());
		voObject.setDeviceName(object.getDeviceName());
		voObject.setManualStatus(object.getManualStatus());
		voObject.setRunStatus(object.getRunStatus());
		return HttpMessageUtils.getReturnMap(voObject,"获取设备详情成功", HttpConstants.OK);
	}


	*/
/**
	 * 报文解析
	 * @param reportText
	 * @return
	 *//*

	@ApiOperation(value = "报文解析", notes = "报文解析", produces = "application/json", response = DeviceVo.class)
	@RequestMapping(value = "/decodeReport", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> decodeReport(
			@ApiParam(required = true, name = "reportText", value = "会员编号") @RequestParam(value = "reportText",required = true) String reportText) {
		logger.info("客户端接收报文"+reportText);
		try{
			socketHandle.retDataHandle(reportText);
			return HttpMessageUtils.getReturnMap(null,"报文解析成功", HttpConstants.OK);
		}catch (Exception e){
			return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
		}
	}



	*/
/**
	 * DTU状态更新
	 * @param status
	 * @return
	 *//*

	@ApiOperation(value = "DTU状态更新", notes = "DTU状态更新", produces = "application/json", response = DeviceDtu.class)
	@RequestMapping(value = "/dtuStatus", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> dtuStatus(
			@ApiParam(required = true, name = "status", value = "dtu状态") @RequestParam(value = "status",required = true) String status) {
		logger.info("dtu状态"+status);
		DeviceDtu objetc =new DeviceDtu();
		objetc.setDtuStatus(status);
		objetc.setDtuTime(new Date());
		objetc.setId("1");
		try{
			deviceDtuService.save(objetc);
			if("1".equals(status)){
				socketHandle.updateStaus();
			}
			return HttpMessageUtils.getReturnMap(null,"DTU状态更新成功", HttpConstants.OK);
		}catch (Exception e){
			return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
		}
	}


	*/
/**
	 * 设备详情
	 * @param appUserCode
	 * @return
	 *//*

	@ApiOperation(value = "选择设备清单", notes = "选择设备清单", produces = "application/json", response = DeviceVo.class)
	@RequestMapping(value = "/getDeviceSelectList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getDeviceSelectList(
			@ApiParam(required = true, name = "appUserCode", value = "会员编号") @RequestParam(value = "appUserCode",required = true) String appUserCode) {
		List<Device> objectList = new ArrayList<Device>();
		List<DeviceVo> voObjectList = new ArrayList<DeviceVo>();
		Device object =new Device();
		objectList =deviceService.findList(object);
		if(objectList.isEmpty()){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		for(Device forObject : objectList){
			DeviceVo voObject =new DeviceVo();
			voObject.setDeviceCode(forObject.getDeviceCode());
			voObject.setDeviceLocat(forObject.getDeviceLocat());
			voObject.setDeviceName("("+forObject.getDeviceLocat()+")"+forObject.getDeviceName());
			voObjectList.add(voObject);
		}
		return HttpMessageUtils.getReturnMap(voObjectList,"获取设备列表成功", HttpConstants.OK);
	}






}
*/
