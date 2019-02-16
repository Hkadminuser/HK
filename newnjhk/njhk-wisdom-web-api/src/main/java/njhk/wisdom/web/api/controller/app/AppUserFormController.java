/*
package njhk.wisdom.web.api.controller.app;

import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.DateUtil;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.common.utils.StringUtils;
import njhk.wisdom.web.bean.vo.AppUserFormVo;
import njhk.wisdom.web.api.config.BaseController;
import njhk.wisdom.web.service.impl.AppUserFormService;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

*/
/**
 * app用户手工填报接口
 * 
 * @author xiangzhangshu
 * @version 2017-11-11
 *//*

@Api(tags = "app用户手工填报接口")
@Controller
@RequestMapping(value = "/app/user/*")
public class AppUserFormController extends BaseController {
	@Autowired
	private AppUserFormService appUserFormService;


	*/
/**
	 * app用户登陆
	 *
	 * @param appUserCode
	 * @return
	 *//*

	@ApiOperation(value = "新增手工填报记录", notes = "新增手工填报记录", produces = "application/json", response = AppUserForm.class)
	@RequestMapping(value = "/addAppUserForm", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addAppUserForm(
			@ApiParam(required = true, name = "appUserCode", value = "app用户编号") @RequestParam(value = "appUserCode", required = true) String appUserCode,
			@ApiParam(required = true, name = "fomrTime", value = "填报时间") @RequestParam(value = "fomrTime", required = true) String fomrTime,
			@ApiParam(required = true, name = "formInputName", value = "填报人") @RequestParam(value = "formInputName", required = true) String formInputName,
			@ApiParam(required = true, name = "formDesc", value = "事件描述") @RequestParam(value = "formDesc", required = true) String formDesc) {
		try {
			AppUserForm object = new AppUserForm();
			object.setFormCode(StringUtils.getSeriesId("F"));
			object.setAppUserCode(appUserCode);
			object.setFormDesc(formDesc);
			object.setFormTime(DateUtil.str2Date(fomrTime));
			object.setFormInputName(formInputName);
			appUserFormService.save(object);
			return HttpMessageUtils.getReturnMap(object, "提交成功", com.law.bean.common.constants.HttpConstants.OK);
		} catch (Exception e) {
			return HttpMessageUtils.getReturnMap(e.getMessage(), "系统异常", com.law.bean.common.constants.HttpConstants.Error);
		}
	}


	*/
/**
	 * 获取填报记录列表
	 *
	 * @return
	 *//*

	@ApiOperation(value = "获取填报记录列表", notes = "获取填报记录列表", produces = "application/json", response = AppUserFormVo.class)
	@RequestMapping(value = "/getAppUserFormList", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAppUserFormList(
			@ApiParam(required = true, name = "appUserCode", value = "app用户编号") @RequestParam(value = "appUserCode", required = true) String appUserCode,
			@ApiParam(required = true, name = "pageNo", value = "页号") @RequestParam(value = "pageNo") Integer pageNo,
			@ApiParam(required = true, name = "pageSize", value = "每页条数") @RequestParam(value = "pageSize") Integer pageSize
	) {
		Page<AppUserForm> objectPage = new Page<AppUserForm>(pageNo, pageSize);
		Page<AppUserFormVo> voObjectPage = new Page<AppUserFormVo>(pageNo, pageSize);
		AppUserForm object = new AppUserForm();
		objectPage = appUserFormService.findPage(objectPage, object);
		if(objectPage.getList().isEmpty()){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		List<AppUserFormVo> voObjectList =new ArrayList<AppUserFormVo>();
		for(AppUserForm forObject : objectPage.getList()){
			AppUserFormVo voObject =new AppUserFormVo();
			voObject.setAppUserCode(forObject.getAppUserCode());
			voObject.setAppUserName(forObject.getAppUserName());
			voObject.setFormDesc(forObject.getFormDesc());
			voObject.setFormCode(forObject.getFormCode());
			voObject.setFormInputName(forObject.getFormInputName());
			voObject.setFormTime(forObject.getFormTime());
			voObjectList.add(voObject);
		}
		voObjectPage.setList(voObjectList);
		voObjectPage.setCount(objectPage.getCount());
		return HttpMessageUtils.getReturnMap(voObjectPage, "获取填报记录列表成功", com.law.bean.common.constants.HttpConstants.OK);
	}

	*/
/**
	 * 获取填报记录详情
	 *
	 * @return
	 *//*

	@ApiOperation(value = "获取填报记录详情", notes = "获取填报记录详情", produces = "application/json", response = AppUserFormVo.class)
	@RequestMapping(value = "/getAppUserFormInfo", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAppUserFormInfo(
			@ApiParam(required = true, name = "formCode", value = "填报记录编号") @RequestParam(value = "formCode") String formCode
	) {
		AppUserForm object = new AppUserForm();
		object.setFormCode(formCode);
		object = appUserFormService.get(object);
		if(object==null){
			return HttpMessageUtils.getReturnMap(null, "无对应记录", HttpConstants.NotSupport);
		}
		AppUserFormVo voObject =new AppUserFormVo();
		voObject.setAppUserCode(object.getAppUserCode());
		voObject.setAppUserName(object.getAppUserName());
		voObject.setFormDesc(object.getFormDesc());
		voObject.setFormCode(object.getFormCode());
		voObject.setFormInputName(object.getFormInputName());
		voObject.setFormTime(object.getFormTime());
		return HttpMessageUtils.getReturnMap(voObject, "获取填报记录详情成功", com.law.bean.common.constants.HttpConstants.OK);
	}

}
*/
