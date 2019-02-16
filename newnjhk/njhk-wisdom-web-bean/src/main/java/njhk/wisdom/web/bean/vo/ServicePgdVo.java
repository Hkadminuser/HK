package njhk.wisdom.web.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.entity.server.ServePerson;
import njhk.wisdom.web.bean.entity.server.ServeProduct;
import njhk.wisdom.web.bean.entity.server.ServeStation;

import java.util.Date;

@ApiModel(description = "服务工单信息")
@Getter
@Setter
@ToString
public class ServicePgdVo {
    @ApiModelProperty(value = "序号(自动增加)")
    private String id;
    @ApiModelProperty(value = "工单号（有规律自动生成）")
    private String orderNum;
   /* @ApiModelProperty(value = " 服务内容")
    private ServeProduct serveProduct;*/
    @ApiModelProperty(value = "总计价格")
    private Float totalPrice;
    @ApiModelProperty(value = "服务时间")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date sertime;
  /*  @ApiModelProperty(value = "普通客户 关联客户信息 ")
    private Customer customer;*/
    /*@ApiModelProperty(value = "  服务站点 关联服务站信息")
    private ServeStation serveStation;*/
    @ApiModelProperty(value = " 原：0维修维护服务 1保洁类服务 2生活照料类")
    private String serviceType;
    @ApiModelProperty(value = " 工单状态 0待派发 1待处理 2待回访 3服务完成 4待作废 5已作废")
    private Integer states;
    @ApiModelProperty(value = "工单类型 null为民政服务工单  1.为商业服务工单 2.残联工单")
    private String pgdtype;
    @ApiModelProperty(value = " 工单的APP状态 1待接单 2已接单 3执行中 4已取消 5已完成 6已评价")
    private Integer appStates;
    @ApiModelProperty(value = "开始服务照片")
    private String picStart;
    @ApiModelProperty(value = "结束服务照片")
    private String picFinished;
    @ApiModelProperty(value = "开始工作时间")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date timeStart;
    @ApiModelProperty(value = "结束工作时间")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date timeEnd;
    @ApiModelProperty(value = "工作时长")
    private Integer period;
    @ApiModelProperty(value = "用户作出的星级评价")
    private String estimateLevel;
    @ApiModelProperty(value = "订单是否通过APP发布的：0-不是，1-是")
    private Integer fromApp;
    @ApiModelProperty(value = "用户指定的工作截止时间")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date sertimeEnd;
    @ApiModelProperty(value = " 实际工作时长")
    private long realPeriod;
    @ApiModelProperty(value = "是否享有实体服务的订单，与Customer的isFree相关：0-不享有实体服务，1-享有实体服务")
    private Integer isFree;
    @ApiModelProperty(value = "应付金额，单位为分")
    private Integer amountPayable;
    @ApiModelProperty(value="服务人员姓名")
    private String servePersonName;
    @ApiModelProperty(value="老人姓名")
    private String customerName;
    @ApiModelProperty(value="服务内容名称")
    private String serveproductName;
    @ApiModelProperty(value="服务站名称")
    private String servestationName;
    @ApiModelProperty(value = "老人详细地址")
    private String community;
    @ApiModelProperty(value = "新建工单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone = "GMT+8")
    private Date createTime;
}
