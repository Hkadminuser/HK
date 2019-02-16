package njhk.wisdom.web.api.controller.serve.ServeProduct;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.server.ServeProduct;
import njhk.wisdom.web.bean.entity.server.ServeType;
import njhk.wisdom.web.service.impl.serve.ServeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Api(tags = "服务产品查询接口")
@Controller
@RequestMapping(value = "/serveProdcut/info/*")
@Slf4j
public class WebServeProductController extends BaseController {
    @Autowired
    private ServeProductService serveProductService;

    /**
     * 查询服务产品
     **/
    @ApiOperation(value = "查询服务类型", notes = "查询服务类型", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "findServeProduct",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServeProduct(
            @RequestParam(value = "pageNo", required = false) String pageNo,//页号
            @RequestParam(value = "pageSize", required = false) String pageSize,//每页条数
            ServeProduct serveProduct) {
        if(pageNo==null||"".equals(pageNo)){
            pageNo="1";
        }
        if(pageSize==null||"".equals(pageSize)){
                pageSize="50";
        }
        System.out.println(serveProduct.getFirstType()+"-------------------------------");
        Page<ServeProduct> objectPage = new Page<ServeProduct>(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        Page<ServeProduct> page=serveProductService.findPage(objectPage,serveProduct);
        try {
            if (page.getList().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(page,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }
    }

    /**
     * 单查查询服务产品
     **/
    @ApiOperation(value = "单查查询服务产品", notes = "单查查询服务产品", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "findServeProductById",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> findServeProductById( @RequestParam(value = "id",required = false) String id) {
        System.out.println(id+"-------------------------------");

       ServeProduct serveProduct=serveProductService.get(id);
        try {
            if (serveProduct.toString().isEmpty()){
                return HttpMessageUtils.getReturnMap(null,"无对应记录", HttpConstants.OK);
            }
            return HttpMessageUtils.getReturnMap(serveProduct,"查询成功",HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }
    }

}
