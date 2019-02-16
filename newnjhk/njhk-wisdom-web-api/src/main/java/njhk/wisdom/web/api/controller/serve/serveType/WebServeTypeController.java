package njhk.wisdom.web.api.controller.serve.serveType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.bean.entity.server.ServeType;
import njhk.wisdom.web.service.impl.serve.ServeTypeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Api(tags = "服务内容表接口")
@Controller
@RequestMapping(value = "/WebServeType/info/*")
@Slf4j
public class WebServeTypeController {

    @Autowired
    private ServeTypeService serveTypeService;
    /**
     * 根据ID查询服务类型
     **/
    @ApiOperation(value = "根据ID查询服务类型", notes = "根据ID查询服务类型", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "findServeTypeById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServeTypeById(
            @RequestParam(value = "serveStationId")String serveStationId,
            HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        List<ServeType> list=serveTypeService.ByserveStationId(serveStationId);
        if (list.isEmpty()){
            return HttpMessageUtils.getReturnMap(null,"无对应记录", HttpConstants.OK);
        }
            return HttpMessageUtils.getReturnMap(list,"查询成功",HttpConstants.OK);
    }


    /**
     * 查询服务类型
     **/
    @ApiOperation(value = "查询服务类型", notes = "查询服务类型", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "findServeType",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServeType(
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            ServeType serveType) {
        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
            pageSize="50";
        }
        Page<ServeType> objectPage = new Page<ServeType>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        try {
            Page<ServeType> page=serveTypeService.findPage(objectPage,serveType);
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);
        }
    }


}
