package njhk.wisdom.web.bean.entity.pojo.serve;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
import njhk.wisdom.web.bean.entity.pojo.cusbackcall.Customer;

import java.util.Date;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class EntityServepgd extends DataEntity<EntityServepgd> {
   @ApiModelProperty(value = "")
    private String id;					//id

    @ApiModelProperty(value = "")
    private String orderNum;			//	工单流水号

    @ApiModelProperty(value = "")
    private Customer cust;           	//	客户

    @ApiModelProperty(value = "")
    private String customerId;			//	客户Id		即将停用

    @ApiModelProperty(value = "")
    private	String customer;			//	客户名称      		即将停用

    @ApiModelProperty(value = "")
    private String custQuId;			//	客户区地址ID	即将停用

    @ApiModelProperty(value = "")
    private String custJieDaoId;		//	客户街道地址ID	即将停用

    @ApiModelProperty(value = "")
    private String custSheQuId;		//	客户社区地址ID	即将停用

    @ApiModelProperty(value = "")
    private String custAddress;			//	客户地址		即将停用

    @ApiModelProperty(value = "")
    private String custPhone;			//	客户电话		即将停用

    @ApiModelProperty(value = "")
    private String custMPhone;			//	客户手机		即将停用

    @ApiModelProperty(value = "")
    private String serveProduct;	//	服务产品名称

    @ApiModelProperty(value = "")
    private EntityServePackage servePackages;	//	服务套餐名称

    @ApiModelProperty(value = "")
    private String serveRequire;		//	服务要求

    @ApiModelProperty(value = "")
    private String serveStat;		//	服务站名称

    @ApiModelProperty(value = "")
    private String apptState;			//	预约状态

    @ApiModelProperty(value = "")
    private String apptRemark;			//	预约备注

    @ApiModelProperty(value = "")
    private String expectTime;			//	预期服务工时

    @ApiModelProperty(value = "")
    private String actualTime;   		//	实际服务工时

    @ApiModelProperty(value = "")
    private Date serveBeginTime;		//	服务开始时间

    @ApiModelProperty(value = "")
    private Date serveEndTime;			//	服务结束时间

    @ApiModelProperty(value = "")
    private Integer serveAttitude = 5;      //	服务态度

    @ApiModelProperty(value = "")
    private Integer serveOnTime = 5;      	//	服务准时

    @ApiModelProperty(value = "")
    private Integer serveQuality = 5;      	//	服务质量

    @ApiModelProperty(value = "")
    private Integer serveInitiative = 5;    //	服务主动性

    @ApiModelProperty(value = "")
    private String custAssess = "5";    	//	客户评价

    @ApiModelProperty(value = "")
    private String serveAssess;			//	服务评价

    @ApiModelProperty(value = "")
    private String serveAdvice;			//	服务建议

    @ApiModelProperty(value = "")
    private String serveNotify;			//	服务通知

    @ApiModelProperty(value = "")
    private String tbReason;			//  调班理由

    @ApiModelProperty(value = "")
    private String zfReason;			//  作废理由

    @ApiModelProperty(value = "")
    private Date AppBeginTime;			//	实际服务开始时间（手机扫描当前时间）

    @ApiModelProperty(value = "")
    private Date AppEndTime;			//	实际服务结束时间

    @ApiModelProperty(value = "")
    private Double AppAddressLat;		//	实际服务地址（经度）

    @ApiModelProperty(value = "")
    private Double AppAddressLng;		//	实际服务地址（纬度）

    @ApiModelProperty(value = "")
    private String auditState;			//  审核状态

    @ApiModelProperty(value = "")
    private String auditRemark;			//	审核备注

    @ApiModelProperty(value = "")
    private String orderType;			//	工单状态

    @ApiModelProperty(value = "")
    private String LDPerson;			//	来电人员	即将停用

    @ApiModelProperty(value = "")
    private Date LDTime;				//	来电时间	即将停用

    @ApiModelProperty(value = "")
    private String PFPerson;			//	派发人员	即将停用

    @ApiModelProperty(value = "")
    private Date PFTime;				//	派发时间	即将停用

    @ApiModelProperty(value = "")
    private String PBPerson;			//	排班人员	即将停用

    @ApiModelProperty(value = "")
    private Date PBTime;				//	排班时间	即将停用

    @ApiModelProperty(value = "")
    private String YYPerson;			//	预约人员	即将停用

    @ApiModelProperty(value = "")
    private Date YYTime;				//	预约时间	即将停用

    @ApiModelProperty(value = "")
    private String TZPerson;			//	通知人员	即将停用

    @ApiModelProperty(value = "")
    private Date TZTime;				//	通知时间	即将停用

    @ApiModelProperty(value = "")
    private String TBPerson;			//	调班人员	即将停用

    @ApiModelProperty(value = "")
    private Date TBTime;				//	调班时间	即将停用

    @ApiModelProperty(value = "")
    private String SHPerson;			//	审核人员	即将停用

    @ApiModelProperty(value = "")
    private Date SHTime;				//	审核时间	即将停用

    @ApiModelProperty(value = "")
    private String ZFPerson;			//	作废人员	即将停用

    @ApiModelProperty(value = "")
    private Date ZFTime;				//	作废时间	即将停用

    @ApiModelProperty(value = "")
    private String HFPerson;			//	回访人员	即将停用

    @ApiModelProperty(value = "")
    private Date HFTime;				//	回访时间	即将停用

    @ApiModelProperty(value = "")
    private String flow;				//	整体流程
}
