/*
package njhk.wisdom.web.api.controller.app;

import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.common.utils.StringUtils;
import njhk.wisdom.web.bean.common.utils.SystemUtils;
import njhk.wisdom.web.bean.vo.AppUserVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.AppUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

*/
/**
 * 优惠券接口
 * 
 * @author xiangzhangshu
 * @version 2017-11-11
 *//*

@Api(tags = "app用户信息接口")
@Controller
@RequestMapping(value = "/app/user/*")
public class AppUserController extends BaseController {
	@Autowired
	private AppUserService appUserService;


	*/
/**
	 * app用户登陆
	 * @param loginName
	 * @return
	 *//*

	@ApiOperation(value = "app用户登陆", notes = "app用户登陆", produces = "application/json", response = AppUser.class)
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> login(
			@ApiParam(required = true, name = "loginName", value = "登陆用户名") @RequestParam(value = "loginName",required = false) String loginName,
			@ApiParam(required = true, name = "passWord", value = "密码") @RequestParam(value = "passWord",required = false) String passWord)
	{
		AppUser object =new AppUser();
		object.setLoginName(StringUtils.toStr(loginName));
		object =appUserService.get(object);
		if(object==null){
			return HttpMessageUtils.getReturnMap(object,"用户不存在，请联系管理员",HttpConstants.NotSupport);
		}
		if(StringUtils.toStr(passWord)!=null&&!SystemUtils.validatePassword(StringUtils.toStr(passWord),object.getPassWord())){
			return HttpMessageUtils.getReturnMap(object,"登陆失败，密码不正确",HttpConstants.NotSupport);
		}
		AppUserVo voObject  =new AppUserVo();
		voObject.setLoginName(object.getLoginName());
		voObject.setProjectCode(object.getProjectCode());
		voObject.setAppUserModules(object.getAppUserModules());
		voObject.setAppUserCode(object.getAppUserCode());
		return HttpMessageUtils.getReturnMap(voObject,"登陆成功",HttpConstants.OK);
	}


}
*/
