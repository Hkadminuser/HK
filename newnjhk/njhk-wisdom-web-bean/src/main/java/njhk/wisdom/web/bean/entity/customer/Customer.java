package njhk.wisdom.web.bean.entity.customer;

import com.fasterxml.jackson.annotation.JsonFormat;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.entity.pojo.customer.EntityCustomer;
import njhk.wisdom.web.bean.vo.CustomerType;
import njhk.wisdom.web.bean.vo.MobileMenu;
import njhk.wisdom.web.bean.vo.PhoneModel;

import java.util.Date;

@ApiModel(description = "服务对象信息")
@Getter
@Setter
@ToString
public class Customer extends DataEntity<Customer> {
    private String[] array;
    @ApiModelProperty(value = "用户ID")
    private String id;
    @ApiModelProperty(value = "客户编号")
    private String uid;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = " 密码")
    private String pwd;
    @ApiModelProperty(value = " 性别")
    private String sex;
    @ApiModelProperty(value = "是否通过APP注册而来：0-否，1-是仅限商业用户；当为民政对象0.为客服录入  1.为政府工作人员录入2.app录入")
    private Integer fromApp;
    @ApiModelProperty(value = " 生日")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date birthday;
    @ApiModelProperty(value = "手机号码")
    private String phone;
    @ApiModelProperty(value = "家庭电话")
    private String familyPhone;
    @ApiModelProperty(value = "社区")
    private String community;
    @ApiModelProperty(value = "用户套餐类型id")
    private CustomerType customertypeId;
    @ApiModelProperty(value = "移动套餐id")
    private MobileMenu mobilemenuId;
    @ApiModelProperty(value = "手机型号id")
    private PhoneModel phonemodelId;
    @ApiModelProperty(value = "社区地址id")
    private String communityId;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = " 纬度")
    private Double addressLat; // 纬度
    @ApiModelProperty(value = "经度")
    private Double addressLng; // 经度
    @ApiModelProperty(value = "身份证")
    private String idNumber;
    @ApiModelProperty(value = "身份证地址")
    private String idNumberAddress;
    @ApiModelProperty(value = "客户类型：1 普通客户 2按康宝客户 3残联 4老干部 5计生委 6援助客户 7商业客户8D类服务对象")
    private Integer type;
    @ApiModelProperty(value = " 照片")
    private String photo;
    @ApiModelProperty(value = " 二维码")
    private String photoB;

    private String moreinfo;
    @ApiModelProperty(value = "录入时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date entrytime;
    @ApiModelProperty(value = "录入人员")
    private String addPerson;
    @ApiModelProperty(value = "注销时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date zhuXiaoTime;
    @ApiModelProperty(value = "注销人员")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private String zhuXiaoPerson;
    @ApiModelProperty(value = "签约时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date qianYueTime;
    @ApiModelProperty(value = "签约人员")
    private String qianYuePerson;
    @ApiModelProperty(value = "录入人员id")
    private String addPersonId;
    @ApiModelProperty(value = "残联证号码")
    private String canLianNumber;
    @ApiModelProperty(value = "残疾类型: 1.视力残疾、2.听力残疾、3.语言残疾、4.智力残疾、5.肢体残疾、6.精神残疾；//残疾指数  4.四级、3.三级、2.二级")
    private String canJiType;
    @ApiModelProperty(value = "1、特困供养人员2、低保对象3、建档立卡的贫困人口4、重点优抚对象5、计划生育特殊家庭成员6、二．三级残疾人中的老年人7、80周岁以上四级残疾老年人")
    private String canJiIndex;

    private String iMei;
    @ApiModelProperty(value = "审核拒绝原因")
    private String statesJuJue;
    @ApiModelProperty(value = "年龄中间字段")
    private String age;
    private String pics;
    @ApiModelProperty(value = "身份证正面照片")
    private String idCardImgZ;
    @ApiModelProperty(value = "身份证反面照片")
    private String idcardimgf;
    @ApiModelProperty(value = "户口本主页照片")
    private String hkbImgZ;
    @ApiModelProperty(value = "户口本本人页照片")
    private String hkbImgB;
    @ApiModelProperty(value = "申请材料照片")
    private String applyImg;
    @ApiModelProperty(value = "民族")
    private String nation;
    @ApiModelProperty(value = "经济来源")
    private String economicSource;
    @ApiModelProperty(value = "证号")
    private String certificateNumber;
    @ApiModelProperty(value = "证类型")
    private String certificateType;
    @ApiModelProperty(value = "其他证类型")
    private String otherCertificateType;
    @ApiModelProperty(value = "职务职称")
    private String postTitle;
    @ApiModelProperty(value = "个人爱好")
    private String personalHobby;
    @ApiModelProperty(value = "居住其他情况")
    private String otherJuzhuCommunity;
    @ApiModelProperty(value = "经济来源其他情况")
    private String otherEconomicSource;
    @ApiModelProperty(value = "其他爱好")
    private String otherPersonalHobby;
    @ApiModelProperty(value = "是否佩戴助听器")
    private String zhuting;
    @ApiModelProperty(value = "是否有过敏史")
    private String allergy;
    @ApiModelProperty(value = "血型")
    private String bloodType;
    @ApiModelProperty(value = "过敏类型")
    private String allergicType;
    @ApiModelProperty(value = "其他过敏类型")
    private String otherAllergicType;
    @ApiModelProperty(value = "0.特困老人、1.低保老人、2.建档立卡贫困老人、3.优抚对象、4.失独老人、5.残疾老人、6.其他、7.空巢老人、8.农村留守老人")
    private String minzhengIndex;
    @ApiModelProperty(value = "其他老人类型")
    private String otherMinzhengIndex;
    @ApiModelProperty(value = "服务状态：1-待签约，2-在用，3-停用，4-注销")
    private Integer states;
    @ApiModelProperty(value = "状态改变原因")
    private String statesChgRsn;
    @ApiModelProperty(value = "政府免费的次数")
    private int freeCount;
    @ApiModelProperty(value = " 是否享有实体服务：0-不享有实体服务，1-享有实体服务")
    private String isFree;
    @ApiModelProperty(value = "是否享受信息服务：最低位为0为不享受，最低位为1为享受")
    private String isDead;
    @ApiModelProperty(value = "实体取消时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date isFreeDate;
    @ApiModelProperty(value = "信息取消时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date isDeadDate;
    @ApiModelProperty(value = "是否在守护宝开户：0-未开户，1-已开户")
    private int isRegisteredAtShb;
    @ApiModelProperty(value = " 向门户网站更新用户信息：0-不需要更新，1-添加，2-修改")
    private int updatePortal;

    // APP添加字段
    @ApiModelProperty(value = " 积分")
    private Integer points;
    @ApiModelProperty(value = "禾康币")
    private Integer coupon;
    @ApiModelProperty(value = "工时已经兑换禾康币的工时数，单位：小时")
    private Integer timeToCouponCount;
    @ApiModelProperty(value = "会员类型")
    private String memberType;
    @ApiModelProperty(value = "上次签到时刻")
    private Date lastSignTime;
    @ApiModelProperty(value = "回访需求度：0=还没有回访，1=经常回访，2=偶尔回访，3=不需要回访")
    private Integer visitLevel;
    @ApiModelProperty(value = "客户状态：0=待社区审核，1=待街道审核，2=待区政府审核，99=已审核")
    private Integer status;
    @ApiModelProperty(value = "客户生活区域：1=城市，2=农村")
    private String lifeAreas;
    @ApiModelProperty(value = "婚姻状态 1=未婚，2=已婚，3=离婚，4=丧偶")
    private String marriageStatus;
    @ApiModelProperty(value = "疾病: 0=健康，1=高血压，2=糖尿病，3=冠心病，4=恶性肿瘤，5=结核病 //6=肝炎，7=脑卒中，8=精神疾病，9=慢性阻塞性肺疾病，10=其他")
    private String disease;
    @ApiModelProperty(value = "其他疾病")
    private String diseaseOther;
    @ApiModelProperty(value = "特殊群体：1.自理=2失能，3=半失能，4=失智")
    private String specialCommunity;
    @ApiModelProperty(value = "老人居住状况：1= 空巢老人，2=留守老人,3=与子女同住,4=独自居住,5=配偶居住,6=其他")
    private String juzhuCommunity;
    @ApiModelProperty(value = "老人听力状况：1= 良好，2=一般,3=较差，4=差")
    private String tingCommunity;
    @ApiModelProperty(value = "经常服用的药物")
    private String yaowu;
    @ApiModelProperty(value = "过敏情况")
    private String guomin;
    @ApiModelProperty(value = "健康备注")
    private String oldremark;
    @ApiModelProperty(value = "现居地址")
    private String currentAddress;
    @ApiModelProperty(value = "同步码")
    private String sysEndCood;

    @ApiModelProperty(value = "区县")
    private String zone;
    @ApiModelProperty(value = "街道")
    private String street;
    @ApiModelProperty(value = "社区")
    private String shequ;

    private Integer suiji;//随机查询的人数

    private String volunteerida;
    private String volunteeridb;
    private String volunteeridc;


    private Date DYentrytime;
    private Date XYentrytime;
    private Date DYzhuXiaoTime;
    private Date XYzhuXiaoTime;
    private Date DYisFreeDate;
    private Date XYisFreeDate;
    private Date DYisDeadDate;
    private Date XYisDeadDate;

    private EntityCustomer ec;
}
