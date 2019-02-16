/*
package njhk.wisdom.web.api.utils;

import njhk.wisdom.web.bean.entity.device.Device;
import njhk.wisdom.web.bean.entity.device.DeviceErtu;
import njhk.wisdom.web.bean.entity.device.DeviceGather;
import njhk.wisdom.web.service.impl.DeviceErtuService;
import njhk.wisdom.web.service.impl.DeviceGatherService;
import njhk.wisdom.web.service.impl.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class SocketHandle {

    @Autowired
    private DeviceErtuService deviceErtuService;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private DeviceGatherService deviceGatherService;

    private static final Logger logger = LoggerFactory.getLogger(SocketHandle.class);

    @Transactional(readOnly = false)
    public void retDataHandle(String retText) {
        int legth =retText.trim().length();
        int legthSingle = legth/14;
        String retTextSingle ="";
        Device object = new Device();
        Map<String,String> retTextMap =new HashMap<String,String>();
        List<Device> obejctList = deviceService.findList(object);
        for(int i=0;i<legthSingle;i++){
            int startIndex =i*14;
            int endIndex =startIndex+14;
            logger.info("起始位置："+startIndex+"---结束位置："+endIndex);
            retTextSingle=retText.substring(startIndex,endIndex);
            logger.info("retTextSingle===+++"+retTextSingle);
            String address =retTextSingle.substring(0,2);
            DeviceErtu deviceErtu =new DeviceErtu();
            deviceErtu.setErtuAddress(address);
            deviceErtu =deviceErtuService.get(deviceErtu);
            if(deviceErtu==null){
                logger.info("设备地址："+address+"---暂没使用");
                continue;
            }
            String singleText16Part1 =retTextSingle.substring(6,8);
            String singleText16Part2 =retTextSingle.substring(8,10);
            String singleText2Part1 = SocketUtils.strReverse(SocketUtils.hexStringToByteStr(singleText16Part1.toUpperCase()));
            String singleText2Part2 = SocketUtils.strReverse(SocketUtils.hexStringToByteStr(singleText16Part2.toUpperCase()));
            deviceErtu.setRetText(singleText2Part1+singleText2Part2);
            deviceErtu.setErtuTime(new Date());
            deviceErtuService.save(deviceErtu);
            retTextMap.put(address,singleText2Part1+singleText2Part2);
        }
            for(Device forObject : obejctList){
                boolean opFlag =false;
                boolean gatherFlag =false;
                String deviceTypeCode =forObject.getDeviceTypeCode();
                DeviceGather deviceGather =new DeviceGather();
                deviceGather.setDeviceCode(forObject.getDeviceCode());
                deviceGather.setDeviceName(forObject.getDeviceName());
                deviceGather.setDeviceLocat(forObject.getDeviceLocat());
                deviceGather.setDeviceTime(new Date());
                logger.info("设备编号：+"+forObject.getDeviceCode());
                if(forObject.getRunStatus()!=null){
                    String[] runStatusParam  =forObject.getRunStatus().split("-");
                    logger.info("运行状态数组长度：+"+runStatusParam.length);
                    if(runStatusParam.length>0&&runStatusParam[0]!=null){
                        String runStatusKeyStr =retTextMap.get(runStatusParam[0]);
                        if(runStatusParam[1]!=null){
                            String runStatusValue =String.valueOf(runStatusKeyStr.charAt(Integer.parseInt(runStatusParam[1])-1));
                            deviceGather.setRunStatus(runStatusValue);
                            if(runStatusParam.length<3||runStatusParam[2]==null||!runStatusValue.equals(runStatusParam[2])){
                                forObject.setRunStatus(runStatusParam[0]+"-"+runStatusParam[1]+"-"+runStatusValue);
                                opFlag=true;
                                gatherFlag=true;
                            }
                        }
                    }
                }
                if(forObject.getManualStatus()!=null){
                    String[] manualStatusParam  =forObject.getManualStatus().split("-");
                    logger.info("制动状态数组长度：+"+manualStatusParam.length);
                    if(manualStatusParam.length>0&&manualStatusParam[0]!=null){
                        String manualStatusKeyStr =retTextMap.get(manualStatusParam[0]);
                        if(manualStatusParam[1]!=null){
                            String manualStatusValue =String.valueOf(manualStatusKeyStr.charAt(Integer.parseInt(manualStatusParam[1])-1));
                            if(manualStatusParam.length<3||manualStatusParam[2]==null||!manualStatusValue.equals(manualStatusParam[2])){
                                forObject.setManualStatus(manualStatusParam[0]+"-"+manualStatusParam[1]+"-"+manualStatusValue);
                                opFlag=true;
                            }
                        }
                    }
                }
                if(forObject.getBallStaus()!=null) {
                    String[] ballStausParam = forObject.getBallStaus().split("-");
                    logger.info("浮球状态数组长度：+"+ballStausParam.length);
                    if(ballStausParam.length>0&&ballStausParam[0] != null) {
                        String ballStausKeyStr = retTextMap.get(ballStausParam[0]);
                        if (ballStausParam[1] != null) {
                            String ballStausValue = String.valueOf(ballStausKeyStr.charAt(Integer.parseInt(ballStausParam[1])-1));
                            if (ballStausParam.length<3||ballStausParam[2] == null || !ballStausValue.equals(ballStausParam[2])) {
                                forObject.setBallStaus(ballStausParam[0] + "-" + ballStausParam[1] + "-" + ballStausValue);
                                opFlag = true;
                            }
                        }
                    }
                }
                if(forObject.getBreakStatus()!=null){
                    String[] breakStatusParam  =forObject.getBreakStatus().split("-");
                    logger.info("故障状态数组长度：+"+breakStatusParam.length);
                    if(breakStatusParam.length>0&&breakStatusParam[0] != null) {
                        String breakStatusKeyStr = retTextMap.get(breakStatusParam[0]);
                        if (breakStatusParam[1] != null) {
                            String breakStatusValue = String.valueOf(breakStatusKeyStr.charAt(Integer.parseInt(breakStatusParam[1])-1));
                            deviceGather.setBreakStatus(breakStatusValue);
                            if (breakStatusParam.length<3||breakStatusParam[2] == null || !breakStatusValue.equals(breakStatusParam[2])) {
                                forObject.setBreakStatus(breakStatusParam[0] + "-" + breakStatusParam[1] + "-" + breakStatusValue);
                                if(breakStatusValue.equals("1")){
                                    forObject.setBreakTime(new Date());
                                }
                                opFlag = true;
                                gatherFlag=true;
                            }
                        }
                    }
                }
                if(opFlag){
                    forObject.setDeviceTime(new Date());
                    forObject.setUpdateDate(new Date());
                    deviceService.save(forObject);
                }
                if(!"DT154096795567549".equals(deviceTypeCode)&&gatherFlag){
                    deviceGatherService.save(deviceGather);
                }
             }
    }



    @Transactional(readOnly = false)
    public void updateStaus() {
        Device object = new Device();
        List<Device> obejctList = deviceService.findList(object);
        for(Device forObject : obejctList){
            String deviceTypeCode =forObject.getDeviceTypeCode();
            DeviceGather deviceGather =new DeviceGather();
            deviceGather.setDeviceCode(forObject.getDeviceCode());
            deviceGather.setDeviceName(forObject.getDeviceName());
            deviceGather.setDeviceLocat(forObject.getDeviceLocat());
            deviceGather.setDeviceTime(new Date());
            logger.info("设备编号：+"+forObject.getDeviceCode());
            if(forObject.getRunStatus()!=null){
                String[] runStatusParam  =forObject.getRunStatus().split("-");
                logger.info("运行状态数组长度：+"+runStatusParam.length);
                if(runStatusParam.length>0&&runStatusParam[0]!=null){
                    if(runStatusParam[1]!=null){
                        String runStatusValue ="00";
                        deviceGather.setRunStatus(runStatusValue);
                        if(runStatusParam.length<3||runStatusParam[2]==null||!runStatusValue.equals(runStatusParam[2])){
                            forObject.setRunStatus(runStatusParam[0]+"-"+runStatusParam[1]+"-"+runStatusValue);
                        }
                    }
                }
            }
            if(forObject.getManualStatus()!=null){
                String[] manualStatusParam  =forObject.getManualStatus().split("-");
                logger.info("制动状态数组长度：+"+manualStatusParam.length);
                if(manualStatusParam.length>0&&manualStatusParam[0]!=null){
                    if(manualStatusParam[1]!=null){
                        String manualStatusValue ="00";
                        if(manualStatusParam.length<3||manualStatusParam[2]==null||!manualStatusValue.equals(manualStatusParam[2])){
                            forObject.setManualStatus(manualStatusParam[0]+"-"+manualStatusParam[1]+"-"+manualStatusValue);
                        }
                    }
                }
            }
            if(forObject.getBallStaus()!=null) {
                String[] ballStausParam = forObject.getBallStaus().split("-");
                logger.info("浮球状态数组长度：+"+ballStausParam.length);
                if(ballStausParam.length>0&&ballStausParam[0] != null) {
                    if (ballStausParam[1] != null) {
                        String ballStausValue = "00";
                        if (ballStausParam.length<3||ballStausParam[2] == null || !ballStausValue.equals(ballStausParam[2])) {
                            forObject.setBallStaus(ballStausParam[0] + "-" + ballStausParam[1] + "-" + ballStausValue);
                        }
                    }
                }
            }
            if(forObject.getBreakStatus()!=null){
                String[] breakStatusParam  =forObject.getBreakStatus().split("-");
                logger.info("故障状态数组长度：+"+breakStatusParam.length);
                if(breakStatusParam.length>0&&breakStatusParam[0] != null) {
                    if (breakStatusParam[1] != null) {
                        String breakStatusValue = "00";
                        deviceGather.setBreakStatus(breakStatusValue);
                        if (breakStatusParam.length<3||breakStatusParam[2] == null || !breakStatusValue.equals(breakStatusParam[2])) {
                            forObject.setBreakStatus(breakStatusParam[0] + "-" + breakStatusParam[1] + "-" + breakStatusValue);
                        }
                    }
                }
            }
            forObject.setDeviceTime(new Date());
            forObject.setUpdateDate(new Date());
            deviceService.save(forObject);
            if(!"DT154096795567549".equals(deviceTypeCode)){
                deviceGatherService.save(deviceGather);
            }
        }
    }




    public static void main(String[] args) {
        SocketHandle socketHandle =new SocketHandle();
        socketHandle.retDataHandle("030202e000d9b80202020000fdb80102026b01b9b8");
    }


}
*/
