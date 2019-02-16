package njhk.wisdom.web.api.controller.serve;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.server.ServeProduct;
import njhk.wisdom.web.bean.vo.ServeProductVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.serve.ServeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 设备接口
 *
 * @author chengsheng
 * @version 2017-11-11
 */
@Api(tags = "服务产品查询接口")
@Controller
@RequestMapping(value = "/serveProdcut/info/*")
public class ServeProductController extends BaseController {
    @Autowired
    private ServeProductService serveProductService;

    /**
     * 获取会员地址列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "服务产品信息列表", notes = "服务产品信息列表", produces = "application/json", response = ServeProductVo.class)
    @RequestMapping(value = "/getServeProductByList", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getServeProductByList (
            @ApiParam(required = false, name = "secondType", value = "第二服务类型") @RequestParam(value = "secondType", required = false) String secondType)
    {
        List<ServeProductVo> serveTypeVoList = new ArrayList<ServeProductVo>();
        ServeProduct serveProduct =new ServeProduct();
        serveProduct.setSecondType(secondType);
        List<ServeProduct> serveProductList = serveProductService.findList(serveProduct);
        if (serveProductList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(serveProductList, "无对应记录", HttpConstants.NotSupport);
        }
        for (ServeProduct forObject : serveProductList) {
            ServeProductVo voObject = new ServeProductVo();
            voObject.setId(forObject.getId());
            voObject.setProduce(forObject.getProduce());
            voObject.setProductname(forObject.getProductname());
            voObject.setFirstType(forObject.getFirstType());
            voObject.setSecondType(forObject.getSecondType());
            voObject.setThirdType(forObject.getThirdType());
            voObject.setDegreeDif(forObject.getDegreeDif());
            voObject.setPrice(forObject.getPrice());
            voObject.setReferTime(forObject.getReferTime());
            voObject.setSysEndCood(forObject.getSysEndCood());
            serveTypeVoList.add(voObject);
        }
        if (serveTypeVoList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(serveTypeVoList, "无对应记录", HttpConstants.NotSupport);
        }
        return HttpMessageUtils.getReturnMap(serveTypeVoList, "获取服务内容列表成功", HttpConstants.OK);
    }
    @ApiOperation(value = "修改服务产品信息", notes = "修改服务产品信息", produces = "application/json", response = ServeProduct.class)
    @RequestMapping(value = "/updateServeProduct", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateServeProduct(
            @ApiParam(required = false, name = "id", value = "产品id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "productname", value = "产品价格") @RequestParam(value = "productname", required = false) String productname){
        ServeProduct objectc =new ServeProduct();
        objectc.setId(id);
        objectc.setProductname(productname);
        try{
            serveProductService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务内容信息修改成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
    @ApiOperation(value = "增加服务产品信息", notes = "增加服务产品信息", produces = "application/json", response = ServeProduct.class)
    @RequestMapping(value = "/insertServeProduct", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertServeProduct(
            @ApiParam(required = false, name = "id", value = "产品id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "productname", value = "产品价格") @RequestParam(value = "productname", required = false) String productname){
        ServeProduct objectc =new ServeProduct();
        objectc.setId(id);
        objectc.setProductname(productname);
        try{
            serveProductService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务内容信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }
    }
    @ApiOperation(value = "删除服务产品信息", notes = "删除服务产品信息", produces = "application/json", response = ServeProduct.class)
    @RequestMapping(value = "/deleteServeProduct", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  deleteServeProduct(
            @ApiParam(required = false, name = "id", value = "产品id") @RequestParam(value = "id", required = false) String id){
        ServeProduct objectc =new ServeProduct();
        objectc.setId(id);

        try{
            serveProductService.delete(objectc);

            return HttpMessageUtils.getReturnMap(null,"服务内容新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
}
