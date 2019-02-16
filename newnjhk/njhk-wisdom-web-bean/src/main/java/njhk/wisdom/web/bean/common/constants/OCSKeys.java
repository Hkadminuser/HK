package njhk.wisdom.web.bean.common.constants;

/**
 * OCS Cache中存储的数据所用的Key的前缀.
 * 
 * @author fenggang
 */
public class OCSKeys {

  /**
   * 默认的访问Token的HTTP请求头的名字
   */
  public static final String ACCESS_TOKEN_HEADER_NAME = "X-Access-Token";
  /**
   * 客户端版本号
   */
  public static final String ACCESS_TOKEN_CLIENT_VERSION = "X-Client-Version";
  /**
   * 客户端设备型号
   */
  public static final String ACCESS_TOKEN_CLIENT_DEVICE = "X-Client-Device"; //clinet_device
  /**
   * 客户端设备版本 	1-android，2-ios，3-web，4-小程序，5-公众号
   */
  public static final String ACCESS_TOKEN_CLIENT_TYPE = "X-Client-Type";//client_type
  /**
   * 客户端设备唯一标示
   */
  public static final String ACCESS_TOKEN_CLIENT_TOKEN = "X-Client-Token"; //client_token

  /**
   * <pre>
   *  缓存用户的key
   * 用法是: String key = D_P_CACHE_USER_ + 123;
   * </pre>
   */
  public static final String D_P_CACHE_USER_KEY = "RONGBA_D_P_CACHE_USER_";

  /**
   * 用户过期时间(单位:秒，30天)
   */
  public static final int D_P_CACHE_USER_EXP_KEY = 60 * 60 * 24 * 30;

  /**
   * 用户更改手机号key
   */
  public static final String D_P_USER_UPDATE_TEL_CODE_KEY = "D_P_USER_UPDATE_TEL_CODE_KEY_";
  
  /**
   * 用户忘记密码key
   */
  public static final String D_P_USER_FORGET_PWD_CODE_KEY = "D_P_USER_FORGET_PWD_CODE_KEY_";
  
  /**
   * 用户注册验证码key
   */
  public static final String D_P_USER_REGISTER_CODE_KEY = "D_P_USER_REGISTER_CODE_KEY_";

  /**
   * 用户注册验证码过期时间(单位:秒，5分)
   */
  public static final int D_P_USER_REGISTER_CODE_TIME_KEY = 60 * 5;
  
  /**
   * 用户登录验证码key
   */
  public static final String D_P_USER_LOGIN_CODE_KEY = "D_P_USER_LOGIN_CODE_KEY_";
  /**
   * 用户登录验证码过期时间(单位:秒，5分)
   */
  public static final int D_P_USER_LOGIN_CODE_TIME_KEY = 60 * 5;

  /**
   * 找回密码验证码key
   */
  public static final String D_P_USRE_FORGET_PASSWORD_CODE_KEY = "D_P_USRE_FORGET_PASSWORD_CODE_KEY_";
  

  /**
   * 用户注册过期时间(单位:秒，30天)
   */
  public static final int D_P_USER_REGISTER_TIME_KEY = 60 * 60 * 24 * 30;

  /**
   * 登录拦截往request中注入用户key
   */
  public static final String D_P_REQUEST_LOGIN_USER_INFO = "D_P_REQUEST_LOGIN_USER_INFO";

}
