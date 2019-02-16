package njhk.wisdom.web.api.controller.customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.resources.Syuser;
import njhk.wisdom.web.bean.vo.SyuserVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.account.SyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Api(tags = "账号信息查询接口")
@Controller
@RequestMapping(value = "/syuser/info/*")
public class SyuserController extends BaseController {
    @Autowired
    private SyuserService syuserService;
    /**
     * 获取会员地址列表
     *
     * @param
     * @return
     */
    @ApiOperation(value = "账号信息列表", notes = "账号信息列表", produces = "application/json", response = SyuserVo.class)
    @RequestMapping(value = "/getSyuserByList", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getSyuserByList (
            @ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
            @ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize,
            @ApiParam(required = false, name = "id", value = "用户id") @RequestParam(value = "id", required = false) String id)
    {
        Page<Syuser> objectPage = new Page<Syuser>(pageNo, pageSize);
        Page<SyuserVo> voObjectPage = new Page<SyuserVo>(pageNo, pageSize);
        Syuser object =new Syuser();
        objectPage = syuserService.findPage(objectPage, object);
        if (objectPage.getList().isEmpty()) {
            return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
        }
        List<SyuserVo> voObjectList = new ArrayList<SyuserVo>();
        for (Syuser forObject : objectPage.getList()) {
            SyuserVo voObject = new SyuserVo();
            voObject.setId(forObject.getId());
            voObject.setName(forObject.getName());
            voObject.setAge(forObject.getAge());
            voObject.setSex(forObject.getSex());
            voObject.setDog(forObject.getDog());
            voObject.setLoginname(forObject.getLoginname());
            voObject.setCreatedatetime(forObject.getCreatedatetime());
            voObject.setLogintime(forObject.getLogintime());
            voObject.setPhoto(forObject.getPhoto());
            voObject.setPwd(forObject.getPassword());
            voObject.setStatus(forObject.getStatus());
            voObject.setStates(forObject.getStates());
            voObject.setSysEndCood(forObject.getSysEndCood());
            voObject.setUsertype(forObject.getUsertype());
            voObject.setUpdatedatetime(forObject.getUpdatedatetime());


            voObjectList.add(voObject);
        }
        if (voObjectList.isEmpty()) {
            return HttpMessageUtils.getReturnMap(voObjectPage, "无对应记录", HttpConstants.NotSupport);
        }
        voObjectPage.setList(voObjectList);
        voObjectPage.setCount(objectPage.getCount());
        return HttpMessageUtils.getReturnMap(voObjectPage, "获取账号信息列表成功", HttpConstants.OK);
    }
    @ApiOperation(value = "修改账号信息", notes = "修改账号信息", produces = "application/json", response = Syuser.class)
    @RequestMapping(value = "/updateSyuser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  updateSyuser(
            @ApiParam(required = false, name = "id", value = "账号id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "name", value = "账号姓名") @RequestParam(value = "id", required = false) String name){
        Syuser objectc =new Syuser();
        objectc.setName(name);
        try{
            syuserService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"账号信息修改成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
    @ApiOperation(value = "增加账号信息", notes = "增加账号信息", produces = "application/json", response = Syuser.class)
    @RequestMapping(value = "/insertSyuser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  insertSyuser(
            @ApiParam(required = false, name = "id", value = "账号id") @RequestParam(value = "id", required = false) String id,
            @ApiParam(required = false, name = "name", value = "账号姓名") @RequestParam(value = "id", required = false) String name){
        Syuser objectc =new Syuser();
        objectc.setId(id);
        objectc.setName(name);
        try{
            syuserService.save(objectc);

            return HttpMessageUtils.getReturnMap(null,"账号信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }
    }
    @ApiOperation(value = "删除账号信息", notes = "删除账号信息", produces = "application/json", response = Syuser.class)
    @RequestMapping(value = "/deleteSyuser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  deleteSyuser(
            @ApiParam(required = false, name = "id", value = "账号id") @RequestParam(value = "id", required = false) String id){
        Syuser objectc =new Syuser();
        objectc.setId(id);

        try{
            syuserService.delete(objectc);

            return HttpMessageUtils.getReturnMap(null,"账号信息新增成功", HttpConstants.OK);
        }catch (Exception e){
            return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", HttpConstants.Error);
        }

    }
}
