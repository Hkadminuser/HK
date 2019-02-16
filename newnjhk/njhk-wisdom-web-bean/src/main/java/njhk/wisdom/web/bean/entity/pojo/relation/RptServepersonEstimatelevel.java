package njhk.wisdom.web.bean.entity.pojo.relation;

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
public class RptServepersonEstimatelevel extends DataEntity<RptServepersonEstimatelevel> {
    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private int estimateLevel;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Date timeStart;

    @ApiModelProperty(value = "")
    private Date timeEnd;

    @ApiModelProperty(value = "")
    private String name1;

    @ApiModelProperty(value = "")
    private int fromApp;

    @ApiModelProperty(value = "")
    private String phone;

    @ApiModelProperty(value = "")
    private String SERVEPERSON_ID;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private int states;

    @ApiModelProperty(value = "")
    private int appStates;

    @ApiModelProperty(value = "")
    private int amountPayable;

    @ApiModelProperty(value = "")
    private int amountAlipay;

    @ApiModelProperty(value = "")
    private int refund;

    @ApiModelProperty(value = "")
    private String referTime;

    @ApiModelProperty(value = "")
    private String mobilephone;

    @ApiModelProperty(value = "")
    private String OTHERSERVICEPGD_ID;

    @ApiModelProperty(value = "")
    private String STATNAME;

    @ApiModelProperty(value = "")
    private String communityid;

    @ApiModelProperty(value = "")
    private String sq_id;

    @ApiModelProperty(value = "")
    private String xz_id;

    @ApiModelProperty(value = "")
    private String xq_id;

    @ApiModelProperty(value = "")
    private String shi_id;
}
