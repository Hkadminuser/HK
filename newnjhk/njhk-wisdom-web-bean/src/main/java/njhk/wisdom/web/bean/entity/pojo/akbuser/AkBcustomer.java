package njhk.wisdom.web.bean.entity.pojo.akbuser;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;

@ApiModel(description = "安康宝用户表")
@Getter
@Setter
@ToString
public class AkBcustomer extends DataEntity<AkBcustomer> {
    @ApiModelProperty(value = "")
    private String iD;

    @ApiModelProperty(value = "地址")
    private  String addressNow;

    @ApiModelProperty(value = "安康宝型号（A型安康宝、B型安康宝、C型安康宝）")
    private  String akbxh;

    @ApiModelProperty(value = "用户编号")
    private  String akbyhlx;

    @ApiModelProperty(value = "付费类型（政府购买， 用户自费）")
    private Integer fflx;

    @ApiModelProperty(value = "")
    private String installMan;

    @ApiModelProperty(value = "")
    private String installPosition;

    @ApiModelProperty(value = "")
    private Date installTime;

    @ApiModelProperty(value = "")
    private  String jtcy_name1;

    @ApiModelProperty(value = "")
    private String jtcy_name2;

    @ApiModelProperty(value = "")
    private String jtcy_name3;

    @ApiModelProperty(value = "")
    private String jtcy_phone1;

    @ApiModelProperty(value = "")
    private String jtcy_phone2;

    @ApiModelProperty(value = "")
    private String jtcy_phone3;

    @ApiModelProperty(value = "")
    private String jtcy_relation1;

    @ApiModelProperty(value = "")
    private String jtcy_relation2;

    @ApiModelProperty(value = "")
    private String jtcy_relation3;

    @ApiModelProperty(value = "")
    private String jtlx;

    @ApiModelProperty(value = "政府购买服务状态申请中（待安装【未上报】）\t1安装中 待安装【已上报】）\t2（已安装\t3未能安装\t4注销中\t5已注销\t6备案\t7")
    private Integer status;

    @ApiModelProperty(value = "绑定电话")
    private String terminalPhone;

    @ApiModelProperty(value = "用户编号")
    private String yhbh;

    @ApiModelProperty(value = "残联 非特殊用户 老干部")
    private String yhlx;

    @ApiModelProperty(value = "")
    private String customer;
}
