package njhk.wisdom.web.bean.entity.server;

import com.fasterxml.jackson.annotation.JsonFormat;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.entity.customer.Customer;

import java.util.Date;

@ApiModel(description = "服务工单信息")
@Getter
@Setter
@ToString
public class ServicePgd extends DataEntity<ServicePgd> {
    private String[] ids;
    @ApiModelProperty(value = "序号(自动增加)")
    private String id;
    @ApiModelProperty(value = "工单号（有规律自动生成）")
    private String orderNum;
    @ApiModelProperty(value = "工单类型 0咨询工单 1普通服务工单 2团购工单 3兑换工单 4实体服务工单")
    private Integer type;
    @ApiModelProperty(value = "发票类型 1无发票 2有发票")
    private Integer fpType;
    private String fpTypeDesc;
    @ApiModelProperty(value = " 发票单位")
    private String fpCompany;
    @ApiModelProperty(value = "普通客户ID 关联客户信息 ")
    private String customer;
    @ApiModelProperty(value = "新建工单员工号")
    private String createSeatNo;
    @ApiModelProperty(value = "新建工单人员姓名")
    private String createSeatName;
    @ApiModelProperty(value = "新建工单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date createTime;
    @ApiModelProperty(value = "派发工单员工号")
    private String distributeSeatNo;
    @ApiModelProperty(value = "派发工单人员姓名")
    private String distributeSeatName;
    @ApiModelProperty(value = "派发工单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date distributeTime;
    @ApiModelProperty(value = "处理工单员工号")
    private String doneSeatNo;
    @ApiModelProperty(value = "处理工单人员姓名 ")
    private String doneSeatName;
    @ApiModelProperty(value = "处理工单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date doneTime;
    @ApiModelProperty(value = "申请作废工单员工号")
    private String askCloseSeatNo;
    @ApiModelProperty(value = "申请作废工单人员姓名")
    private String askCloseName;
    @ApiModelProperty(value = "申请作废工单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date askCloseTime;
    @ApiModelProperty(value = "作废工单员工号")
    private String closeSeatNo;
    @ApiModelProperty(value = "作废工单人员姓名")
    private String closeSeatName;
    @ApiModelProperty(value = " 作废工单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date closeTime;
    @ApiModelProperty(value = "回访工单员工号 ")
    private String callSeatNo;
    @ApiModelProperty(value = "回访工单人员姓名")
    private String callSeatName;
    @ApiModelProperty(value = "回访工单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date callTime;
    @ApiModelProperty(value = "回访信息")
    private String hfinfo;
    @ApiModelProperty(value = " 回访客户满意度 //0满意 1一般 2不满意")
    private String star;
    @ApiModelProperty(value = " 服务内容ID")
    private String serveProduct;
    @ApiModelProperty(value = " 原：0维修维护服务 1保洁类服务 2生活照料类")
    private String serviceType;
    @ApiModelProperty(value = "家庭服务工单中服务单价")
    // 现在：第一服务类型ID
    private Float unitPrice;
    @ApiModelProperty(value = "家庭服务工单中服务面积")
    private Float area;
    @ApiModelProperty(value = "家庭服务工单中服务次数")
    private String num;
    @ApiModelProperty(value = "家庭服务工单中服务优惠")
    private Float des;
    @ApiModelProperty(value = "生活服务工单故障现象")
    private String failure;
    @ApiModelProperty(value = " 生活服务工单服务保障")
    private String ensure;
    @ApiModelProperty(value = "生活服务工单修复结果")
    private Integer result;
    @ApiModelProperty(value = "服务内容价格")
    private Float fixPrice;
    @ApiModelProperty(value = "服务内容价格")
    private Float servePrice;
    @ApiModelProperty(value = "上门费")
    private Float serveFee;
    @ApiModelProperty(value = "材料费")
    private Float materialPrice;
    @ApiModelProperty(value = "总计价格")
    private Float totalPrice;
    @ApiModelProperty(value = "维修服务工单中服务优惠")
    private Float desServe;
    @ApiModelProperty(value = "维修服务工单中材料优惠")
    private Float desMaterial;
    @ApiModelProperty(value = "维修服务工单中上门优惠")
    private Float desFee;
    @ApiModelProperty(value = " 照料服务工单中服务优惠")
    private Float desCare;
    @ApiModelProperty(value = " 服务要求")
    private String serrequire;
    @ApiModelProperty(value = "服务时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date sertime;
    @ApiModelProperty(value = "  服务站点ID  关联服务站信息")
    private String serveStation;

    private ServeStation servbusiness;// 服务商 /** 关联服务商信息 */
    @ApiModelProperty(value = "申请作废理由")
    private String closeReason;
    @ApiModelProperty(value = " 提交人（将申请提交给xxx用户进行调整）")
    private String closePerson;
    @ApiModelProperty(value = " 工单状态 0待派发 1待处理 2待回访 3服务完成 4待作废 5已作废")
    private Integer states;
    @ApiModelProperty(value = "工单状态说明")
    private String statusDesc;
    @ApiModelProperty(value = " 客户类型说明")
    private String customerDesc;
    @ApiModelProperty(value = " 新增服务工单设置的服务次数")
    private String number;
    @ApiModelProperty(value = "工单类型 null为民政服务工单  1.为商业服务工单")
    private String pgdtype;
    @ApiModelProperty(value = " 工单的APP状态 1待接单 2已接单 3执行中 4已取消 5已完成 6已评价")
    private Integer appStates;

    private String picStart;

    private String picRunning;

    private String picFinished;
   /* private Set<ServePerson> servePersons = new HashSet<ServePerson>(0); // 主要服务人员，可以进行APP操作

    private Set<ServePerson> otherServePersons = new HashSet<ServePerson>(0); // 其他服务人员，不可以进行APP操作*/
    @ApiModelProperty(value = "接单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date timeGet;
    @ApiModelProperty(value = "开始工作时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date timeStart;
    @ApiModelProperty(value = "结束工作时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date timeEnd;
    @ApiModelProperty(value = "工作时长")
    private Integer period;
    @ApiModelProperty(value = "用户作出的星级评价")
    private String estimateLevel;
    @ApiModelProperty(value = " 用户作出的文字评价")
    private String estimate;
    @ApiModelProperty(value = "用户作出的语音评价")
    private String estimateRecord;
    @ApiModelProperty(value = "订单是否通过APP发布的：0-不是，1-是")
    private Integer fromApp;
    @ApiModelProperty(value = "用户指定的工作截止时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date sertimeEnd;
    @ApiModelProperty(value = " 实际工作时长")
    private long realPeriod;
    @ApiModelProperty(value = " 实际工作时长，仅限导出功能使用")
    private double shiTime;
    @ApiModelProperty(value = " 是否上门:0-未上门 ， 1-已上门")
    private Integer visited;
    @ApiModelProperty(value = "是否享有实体服务的订单，与Customer的isFree相关：0-不享有实体服务，1-享有实体服务")
    private Integer isFree;
    @ApiModelProperty(value = " 是否已付款：0-未付款，1-已付款。")
    private Integer paid;
    @ApiModelProperty(value = "应付金额，单位为分")
    private Integer amountPayable;
    @ApiModelProperty(value = " 支付宝金额，单位为分")
    private Integer amountAlipay;
    @ApiModelProperty(value = " 微信金额，单位为分")
    private Integer amountWx;
    @ApiModelProperty(value = "银联金额，单位为分")
    private Integer amountUpmp;
    @ApiModelProperty(value = "翼支付金额，单位为分")
    private Integer amountBestPay;
    @ApiModelProperty(value = "现金，单位为分")
    private Integer cash;
    @ApiModelProperty(value = "禾康币金额，单位分")
    private Integer amountCoupon;
    @ApiModelProperty(value = "退款金额，单位为分")
    private Integer refund;
    @ApiModelProperty(value = "支付对象charge的ID")
    private String chargeId;
  /*  @ApiModelProperty(value = "退款")
    private Set<RefundObj> refunds = new HashSet<RefundObj>(0); // 退款*/

    // 健康数据
    @ApiModelProperty(value = "血压-低压")
    private Double pressureLow;
    @ApiModelProperty(value = "血压-高压")
    private Double pressureHigh;
    @ApiModelProperty(value = "心率")
    private Double sugarEmpty;
    @ApiModelProperty(value = "血糖-血浆")
    private Double sugarPlasma;
    @ApiModelProperty(value = "数据来源")
    private String datafrom;
    /*	*/
    @ApiModelProperty(value = "加盟商评价")
    private String jiamengEstimate;
    @ApiModelProperty(value="主服务人员ID")
    private String servePersonID;
    @ApiModelProperty(value="主服务人员姓名")
    private String servePersonName;
    @ApiModelProperty(value="主服务人员电话")
    private String servePersonPhone;
    @ApiModelProperty(value="从服务人员姓名")
    private String otherservePersonName;
    @ApiModelProperty(value="从服务人员ID")
    private String otherservePersonID;
    @ApiModelProperty(value="老人姓名")
    private String customerName;
    @ApiModelProperty(value="服务内容名称")
    private String serveproductName;
    @ApiModelProperty(value="服务站名称")
    private String servestationName;
    @ApiModelProperty(value = "同步码")
    private String sysEndCood;
    @ApiModelProperty(value = "老人详细地址")
    private String community;

    private Customer ct;

    private String customerType;//客户类型
    private String position;//服务人员类型
    private String customerphone;//客户电话 联系方式一
    private String familyPhone;//客户电话 联系方式二
    private String communityid;//社区id
    private Date daYusertime;//大于这个服务时间
    private Date xiaoYusertime;//小于这个服务时间
    private String price;
    private String address;
    private String serviceTypeName;
}
