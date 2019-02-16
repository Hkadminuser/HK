package njhk.wisdom.web.bean.entity.pojo.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class EntityCustomer extends DataEntity<EntityCustomer> {

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
    private String jtcyaddress1;

    @ApiModelProperty(value = "")
    private String jtcyaddress2;

    @ApiModelProperty(value = "")
    private String jtcyname1;

    @ApiModelProperty(value = "")
    private String jtcyname2;

    @ApiModelProperty(value = "")
    private String jtcyphone1;

    @ApiModelProperty(value = "")
    private String jtcyphone2;

    @ApiModelProperty(value = "")
    private String jtcyrelation1;

    @ApiModelProperty(value = "")
    private String jtcyrelation2;

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
    private String jtcyaddress3;

    @ApiModelProperty(value = "")
    private String jtcyage3;

    @ApiModelProperty(value = "")
    private String jtcybyphone1;

    @ApiModelProperty(value = "")
    private String jtcybyphone2;

    @ApiModelProperty(value = "")
    private String jtcyidNumber3;

    @ApiModelProperty(value = "")
    private String jtcylocation3;

    @ApiModelProperty(value = "")
    private String jtcyname3;

    @ApiModelProperty(value = "")
    private String jtcynation3;

    @ApiModelProperty(value = "")
    private String jtcyphone3;

    @ApiModelProperty(value = "")
    private String jtcyrelation3;

    @ApiModelProperty(value = "")
    private String jtcysex1;

    @ApiModelProperty(value = "")
    private String jtcysex2;

    @ApiModelProperty(value = "")
    private String jtcysex3;

    @ApiModelProperty(value = "")
    private String otherPattern;

    @ApiModelProperty(value = "")
    private String pattern;

    @ApiModelProperty(value = "")
    private String target;
}
