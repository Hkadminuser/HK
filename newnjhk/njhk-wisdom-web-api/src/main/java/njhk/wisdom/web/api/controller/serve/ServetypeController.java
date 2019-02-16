package njhk.wisdom.web.api.controller.serve;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;

import njhk.wisdom.web.bean.entity.server.ServeType;

import njhk.wisdom.web.bean.vo.ServeTypeVo;

import njhk.wisdom.web.api.config.BaseController;

import njhk.wisdom.web.service.impl.serve.ServeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 设备接口
 *
 * @author chengsheng
 * @version 2017-11-11
 */
@Api(tags = "服务内容查询接口")
@Controller
@RequestMapping(value = "/Servetype/info/*")
public class ServetypeController extends BaseController {
    @Autowired
    private ServeTypeService serveTypeService;

    /**
     * 获取会员服务内容列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "服务内容列表", notes = "服务内容列表", produces = "application/json", response = ServeTypeVo.class)
    @RequestMapping(value = "/getServetype", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getServeTypeInfo(
            @ApiParam(required = true, name = "typeLevel", value = "类型级别") @RequestParam(value = "typeLevel", required = true) String typeLevel)
    {
        List<ServeTypeVo> serveTypeVoList = new ArrayList<ServeTypeVo>();
        ServeType serveType =new ServeType();
        serveType.setTypeLevel(Integer.valueOf(typeLevel));
        List<ServeType> serveTypeList = serveTypeService.findList(serveType);

        if (serveTypeList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(serveTypeList, "无对应记录", HttpConstants.NotSupport);
        }
        for (ServeType forObject : serveTypeList) {
            ServeTypeVo voObject = new ServeTypeVo();
            voObject.setId(forObject.getId());
            voObject.setTypeName(forObject.getTypeName());
            serveTypeVoList.add(voObject);
        }
        if (serveTypeVoList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(serveTypeVoList, "无对应记录", HttpConstants.NotSupport);
        }

        return HttpMessageUtils.getReturnMap(serveTypeVoList, "获取服务内容成功", HttpConstants.OK);
    }


    /**
     * 修改服务内容信息
     *
     * @param
     * @return
     */

    @ApiOperation(value = "修改服务内容信息列表", notes = "修改服务内容信息列表", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/updateServetype", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updateServeType(
            @ApiParam(required = false, name = "beizhu", value = "参数一") @RequestParam(value = "beizhu", required = false) String beizhu,
            @ApiParam(required = false, name = "typeName", value = "参数一") @RequestParam(value = "typeName", required = false) String typeName)
    {
        ServeType objects=new ServeType();
        objects.setBeizhu(beizhu);
        objects.setTypeName(typeName);

        try {
            serveTypeService.save(objects);
            return  HttpMessageUtils.getReturnMap(null,"服务内容更新成功", HttpConstants.OK);
        } catch (Exception e) {
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.OK);

        }
    }


    /**
     * 增加服务内容信息
     *
     * @param
     * @return
     */
    @ApiOperation(value = "增加服务内容", notes = "增加服务内容", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/insertServetype", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> insertServeType(
            @ApiParam(required = false, name = "beizhu", value = "参数一") @RequestParam(value = "beizhu", required = false) String beizhu,
            @ApiParam(required = false, name = "typeName", value = "参数二") @RequestParam(value = "typeName", required = false) String typeNam)
    {
        ServeType objects=new ServeType();
        objects.setBeizhu(beizhu);
        objects.setTypeName(typeNam);
        try {
            serveTypeService.save(objects);
            return  HttpMessageUtils.getReturnMap(null,"服务内容增加成功",HttpConstants.OK);
        } catch (Exception e) {
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.OK);

        }
    }



    /**
     * 删除服务内容
     *
     * @param
     * @return
     */
    @ApiOperation(value = "删除服务内容", notes = "删除服务内容", produces = "application/json", response = ServeType.class)
    @RequestMapping(value = "/deleteServetype", method = RequestMethod.POST)
    @ResponseBody

    public Map<String,Object> deleteServeType( @ApiParam(
            required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
    {
        ServeType objects=new ServeType();
        objects.setId(id);

        try {
            serveTypeService.delete(objects);
            return  HttpMessageUtils.getReturnMap(null,"服务内容删除成功",HttpConstants.OK);
        } catch (Exception e) {
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.OK);

        }
    }



}
