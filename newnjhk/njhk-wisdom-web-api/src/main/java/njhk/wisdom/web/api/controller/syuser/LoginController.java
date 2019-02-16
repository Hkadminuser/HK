package njhk.wisdom.web.api.controller.syuser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.api.utils.MD5Util;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.resources.Syuser;
import njhk.wisdom.web.service.impl.account.SyuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Random;

@Api(tags = "登录接口")
@Controller
@RequestMapping(value = "/syuer/info/*")
@Slf4j
public class LoginController {
    @Autowired
    private SyuserService syuserService;
    @ApiOperation(value = "登录禾康平台", notes = "登录禾康平台", produces = "application/json", response = Syuser.class)
    @RequestMapping(value = "findsyuer",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request,String username,String password,String code){
        HttpSession session=request.getSession();
        Syuser syuser=new Syuser();
        String pwd=null;
        if (password!=null&&!"".equals(password)) {
            pwd =MD5Util.getMD5(password, false, 32);
        }
        syuser.setLoginname(username);
        syuser.setPassword(pwd);
        try {
            Syuser u=syuserService.login(syuser);
            if (u==null||code!=session.getAttribute("code")){
                return HttpMessageUtils.getReturnMap(null,"账号或密码不正确", HttpConstants.OK);
            }
                return HttpMessageUtils.getReturnMap(u,"登录成功",HttpConstants.OK);

        } catch (Exception e) {
                log.error("系统异常=====>"+e.getMessage());
                return HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常",HttpConstants.NotSupport);

        }

    }

    @ApiOperation(value = "获得验证码", notes = "获得验证码", produces = "application/json", response = String.class)
    @RequestMapping(value = "code",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getCode(HttpServletRequest request){
        String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb=new StringBuilder(4);
        for(int i=0;i<4;i++)
        {
            char ch=str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        HttpSession session=request.getSession();
        session.setAttribute("code",sb.toString());
        return HttpMessageUtils.getReturnMap(sb.toString(),"系统异常",HttpConstants.OK);
    }
}
