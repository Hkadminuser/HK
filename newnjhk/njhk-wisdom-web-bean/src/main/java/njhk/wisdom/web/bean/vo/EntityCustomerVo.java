package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@ApiModel(description = "")
@Getter
@Setter
@ToString
public class EntityCustomerVo {

    @ApiModelProperty(value = "")
    private String ID;

    @ApiModelProperty(value = "")
    private Double balance;

    @ApiModelProperty(value = "")
    private Integer batch;

    @ApiModelProperty(value = "")
    private Date guidangtime;

    @ApiModelProperty(value = "")
    private Integer isdisability;

    @ApiModelProperty(value = "")
    private Integer isguidang;

    @ApiModelProperty(value = "")
    private Integer islow;

    @ApiModelProperty(value = "")
    private Integer isspecial;

    @ApiModelProperty(value = "")
    private String jtcy_address1;

    @ApiModelProperty(value = "")
    private String jtcy_address2;

    @ApiModelProperty(value = "")
    private String jtcy_name1;

    @ApiModelProperty(value = "")
    private String jtcy_name2;

    @ApiModelProperty(value = "")
    private String jtcy_phone1;

    @ApiModelProperty(value = "")
    private String jtcy_phone2;

    @ApiModelProperty(value = "")
    private String jtcy_relation1;

    @ApiModelProperty(value = "")
    private String jtcy_relation2;

    @ApiModelProperty(value = "")
    private Integer jtlx;

    @ApiModelProperty(value = "")
    private String newphone;

    @ApiModelProperty(value = "")
    private String remark;

    @ApiModelProperty(value = "")
    private Double subamount;

    @ApiModelProperty(value = "")
    private String subtype;

    @ApiModelProperty(value = "")
    private String customer;

    @ApiModelProperty(value = "")
    private Integer ischegnshisanwu;

    @ApiModelProperty(value = "")
    private Integer isnongcunwubao;

    @ApiModelProperty(value = "")
    private String desiredService;

    @ApiModelProperty(value = "")
    private String government;

    @ApiModelProperty(value = "")
    private String governmentTarget;

    @ApiModelProperty(value = "")
    private String jtcy_address3;

    @ApiModelProperty(value = "")
    private String jtcy_age3;

    @ApiModelProperty(value = "")
    private String jtcy_byphone1;

    @ApiModelProperty(value = "")
    private String jtcy_byphone2;

    @ApiModelProperty(value = "")
    private String jtcy_idNumber3;

    @ApiModelProperty(value = "")
    private String jtcy_location3;

    @ApiModelProperty(value = "")
    private String jtcy_name3;

    @ApiModelProperty(value = "")
    private String jtcy_nation3;

    @ApiModelProperty(value = "")
    private String jtcy_phone3;

    @ApiModelProperty(value = "")
    private String jtcy_relation3;

    @ApiModelProperty(value = "")
    private String jtcy_sex1;

    @ApiModelProperty(value = "")
    private String jtcy_sex2;

    @ApiModelProperty(value = "")
    private String jtcy_sex3;

    @ApiModelProperty(value = "")
    private String otherPattern;

    @ApiModelProperty(value = "")
    private String pattern;

    @ApiModelProperty(value = "")
    private String target;
}
