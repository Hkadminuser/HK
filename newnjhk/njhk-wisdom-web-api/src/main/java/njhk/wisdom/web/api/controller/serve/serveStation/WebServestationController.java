package njhk.wisdom.web.api.controller.serve.serveStation;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.server.ServePerson;
import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.bean.entity.server.ServeType;
import njhk.wisdom.web.bean.vo.ServeStationVo;
import njhk.wisdom.web.service.impl.serve.ServePersonService;
import njhk.wisdom.web.service.impl.servestation.WebServestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 服务站Controller
 *
 * @author wk
 * @version 2018-12-20
 */
@Api(tags = "服务站接口")
@Controller
@RequestMapping(value = "/WebServestation/info/*")
@Slf4j
public class WebServestationController {
    @Autowired
    private WebServestationService webServestationService;

    @Autowired
    private ServePersonService servePersonService;

    /**
     *
     * 查询Servestation
     * */
    @ApiOperation(value = "查询Servestation", notes = "查询Servestation", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/findServestation",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServestation(
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            ServeStation serveStation,
            HttpServletResponse response
    ) {

        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<ServeStation> objectPage=new Page<ServeStation>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));
        try {
            Page<ServeStation> page=webServestationService.findPage(objectPage,serveStation);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应数据", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.OK);

        }
    }

    /**
     *
     * 单查Servestation
     * */
    @ApiOperation(value = "单查Servestation", notes = "单查Servestation", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/getServestation",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getServestation(
            @RequestParam(value = "id",required = true)String id,
            @RequestParam(value = "statSheQuId",required = true)String statSheQuId,
            HttpServletResponse response
    ){

        try {
            ServeStation serveStation=webServestationService.get(id);
            String zone=webServestationService.selevtZone(statSheQuId);
            String street=webServestationService.selevtStreet(statSheQuId);
            String shequ=webServestationService.selevtShequ(statSheQuId);
            ServeStationVo sv=new ServeStationVo();
            sv.setType(serveStation.getType());
            sv.setId(serveStation.getId());
            sv.setStatNum(serveStation.getStatNum());
            sv.setStatname(serveStation.getStatname());
            sv.setStatType(serveStation.getStatType());
            sv.setZone(zone);
            sv.setStreet(street);
            sv.setShequ(shequ);
            sv.setAddress(serveStation.getAddress());
            sv.setEqptNum(serveStation.getEqptNum());
            sv.setPhone(serveStation.getPhone());
            sv.setFirstAgent(serveStation.getFirstAgent());
            sv.setSecondAgent(serveStation.getSecondAgent());
            sv.setContact(serveStation.getContact());
            sv.setContactPhone(serveStation.getContactPhone());
            if (sv.toString().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(sv,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 单查Servestation
     * */
    @ApiOperation(value = "根据ID单查Servestation", notes = "根据ID单查Servestation", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/findServestationById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServestationById(
            @RequestParam(value = "id",required = true)String id,
            HttpServletResponse response
    ){

        try {
            ServeStation serveStation=webServestationService.get(id);
            if (serveStation.toString().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(serveStation,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);
        }
    }

    /**
     *
     * 停用Servestation
     * */
    @ApiOperation(value = "停用Servestation", notes = "停用Servestation", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/StopServestation",method = RequestMethod.POST)
    @ResponseBody
   public Map<String, Object> StopServestation(
           @RequestParam(value = "id")String id,
           HttpServletResponse response
    ){

        try {
            webServestationService.StopServestation(id);
            return HttpMessageUtils.getReturnMap(null,"停用成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"停用失败",HttpConstants.NotSupport);
        }


    }

    /**
     *
     * 查询该服务站中的服务人员
     * */
    @ApiOperation(value = "查询该服务站中的服务人员", notes = "查询该服务站中的服务人员", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/findServePersonByServestationId",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  findServePersonByServestationId(
            @RequestParam(value = "servestationId")String servestationId,
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            HttpServletResponse response
    ){
            if(pageNo==null||"".equals(pageNo)){
                pageNo="1";
            }
            if(pageSize==null||"".equals(pageSize)){
                pageSize="50";
            }
        Page<ServeStation> objectPage=new Page<ServeStation>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));
            ServeStation serveStation=new ServeStation();
            serveStation.setPage(objectPage);
            serveStation.setId(servestationId);
        try {
            List<ServeStation> list=servePersonService.findServePersonByServestationId(serveStation);
            Page<ServeStation> page=new Page<ServeStation>();
            page.setList(list);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应数据",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }

    }

    /**
     *
     * 根据服务站名称查询服务站
     * */
    @ApiOperation(value = "查询该服务站中的服务人员", notes = "查询该服务站中的服务人员", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/findServestationByStatname",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  findServestationByStatname(
            @RequestParam(value = "statname")String statname,
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            HttpServletResponse response
    ){
        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<ServeStation> objectPage=new Page<ServeStation>(Integer.valueOf(pageNo),Integer.valueOf(pageSize));
        ServeStation serveStation=new ServeStation();
        serveStation.setPage(objectPage);
        serveStation.setStatname(statname);
        try {
            List<ServeStation> list=webServestationService.findServestationByStatname(serveStation);
            Page<ServeStation> page=new Page<ServeStation>();
            page.setList(list);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应数据",HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }

    }


}
