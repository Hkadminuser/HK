package njhk.wisdom.web.bean.common.constants;

import org.springframework.util.ClassUtils;

public class kyLawConstant {
	
	public static final String SF_FILE_SEPARATOR = System.getProperty("file.separator");//文件分隔符
	public static final String SF_LINE_SEPARATOR = System.getProperty("line.separator");//行分隔符
	public static final String SF_PATH_SEPARATOR = System.getProperty("path.separator");//路径分隔符

	public static final String QRCODE_PATH = ClassUtils.getDefaultClassLoader().getResource("static").getPath()+SF_FILE_SEPARATOR+"qrcode"; 
	
	//微信账单 相关字段 用于load文本到数据库
	public static final String WEIXIN_BILL = "tradetime, ghid, mchid, submch, deviceid, wxorder, bzorder, openid, tradetype, tradestatus, bank, currency, totalmoney, redpacketmoney, wxrefund, bzrefund, refundmoney, redpacketrefund, refundtype, refundstatus, productname, bzdatapacket, fee, rate";
	
	public static final String PATH_BASE_INFO_XML = SF_FILE_SEPARATOR+"WEB-INF"+SF_FILE_SEPARATOR+"xmlConfig"+SF_FILE_SEPARATOR;
	
	public static final String CURRENT_USER = "UserInfo";
	
	public static final String SUCCESS = "success";
	
	public static final String FAIL = "FAIL";
	
	
	
	
	//-------自定义支付宝签名返回码-----//
	
	public static final String singSuccess="1";  //支付宝签名成功
	public static final String singFail ="0";    //支付宝签名失败
	
	public static final String checkSuccess="1";  //支付宝验签名成功
	public static final String checkFail ="0";    //支付宝验签失败
	
	public static final String payBackAppIdE="7";           //支付验参appId不一致
	public static final String payBackWaitBuyerPay ="2";    //支付验参订单状态代付款
	public static final String payBackTradeClosed ="3";    //支付验参订单状态支付超时
	public static final String payBackTradeSuccess="4";    //支付验参订单状态支付成功
	public static final String payBackTradeDone="10";    //支付验参订单状态已经支付
	public static final String payBackOrderNotExsit="5";    //支付订单在商户系统不存在
	public static final String payBackOrderAmountE="6";    //支付订单金额不一致
	public static final String payBackOkEnd="1";           //支付回调成功结束
	public static final String payBackOtherE="8";           //支付回调其他异常
	public static final String payBackAmountE="9";           //支付可用余额不足
	
	   
	
	public static final String is_payed="1";  //已支付
	public static final String is_not_payed ="0";    //支付宝签名失败
	
	public static final String logout="0";  //退出
	public static final String login ="1";    //登录
	
	public static final String is_period="1";  		//主订单分期中
	public static final String is_payed_over ="3";    //主订单支付完成
	
	public static final int pay_order=1;  		//订单支付
	public static final int pay_recharge =2;    //钱包充值
	
	
	//----商户状态 0-审核中 1-通过审核 2-审核失败------//
	public static final String merchant_status_check = "0"; //审核中
	public static final String merchant_status_ok = "1"; //通过审核
	public static final String merchant_status_fail= "2"; //审核失败

	//短信发送类型
	public static final int sms_registe =1;
	public static final int sms_repassword =2;
	public static final int sms_login=3;
	

	//支付渠道
	public static final int ali_pay=1; 
	public static final int weixin_pay=2; 
	//充值状态
	public static final int recharge_need=0; //待充值 
	public static final int recharge_done=1; //充值成功
	public static final int recharge_failue=2; //充值失败

	//房源搜索方式
	public static final int productSerachInput=1; // 1-搜索框和其他条件组合
	public static final int productSerachZone=2; // 2-区域和其他条件组合
	public static final int productSerachInputWithCount=3; // 1-区域和其他条件组合带数量情况
	public static final int productStatusSale=1; // 商品状态 1-在售 
	public static final int productStatusUnSale=2; // 商品状态  2-下架
	public static final int productStatusNeedSale=0; // 商品状态  0-待上架


	//房源推荐列表位置
	public static final int lzr_product_home=1; // 1-首页推荐
	public static final int lzr_product_rent=2; // 2-租房推荐

	//消息读取状态
	public static final int is_not_read=0; // 0-未读
	public static final int is_read=1; // 1-已读

	//交易渠道
	public static final int tradeChannelAlipay= 1;//支付宝支付
	public static final int tradeChannelWeixin= 2;//微信支付
	public static final int tradeChannelBalance= 3;//余额支付

	//首页推荐数量
	public static final int homeDefalutCountProduct= 10;//首页房源推荐默认10条
	public static final int homeWholeAndJoinProduct= 4;//首页整租合租推荐默认4条
	public static final int homeDirectProductProduct= 4;//首页整租合租推荐默认4条


	//订单状态 0-待付款 1-已付款 2-已发货 3-交易成功 4-交易取消  5-交易关闭（超时未付款） 6 -退款中 7-异常单
	public static final String order_status_need_pay="0";
	public static final String order_status_is_payed="1";
	public static final String order_status_is_delivery="2";
	public static final String order_status_is_success="3";
	public static final String order_status_is_cancle="4";
	public static final String order_status_is_closed="5";
	public static final String order_status_is_payback="6";
	public static final String order_status_is_exeception="7";
	//显示状态 0-正常 1-不显示
	public static final String is_show="0";
	public static final String is_not_show="1";
	//优惠券类型
	public static final String couponTypeSingle="1";
	public static final String couponTypePlatform="2";
	public static final String couponTypeDisc="3";
}
