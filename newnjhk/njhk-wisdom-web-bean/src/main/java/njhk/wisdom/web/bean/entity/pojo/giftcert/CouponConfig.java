package njhk.wisdom.web.bean.entity.pojo.giftcert;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class CouponConfig extends DataEntity<CouponConfig> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Integer firstReg;

    @ApiModelProperty(value = "")
    private Integer limitPerOrder;

    @ApiModelProperty(value = "")
    private Integer minAmount;

    @ApiModelProperty(value = "")
    private Integer points;

    @ApiModelProperty(value = "")
    private Integer points2Coupon;

    @ApiModelProperty(value = "")
    private  Integer money;

    @ApiModelProperty(value = "")
    private Integer money2Coupon;

    @ApiModelProperty(value = "")
    private String time;

    @ApiModelProperty(value = "")
    private String time2Coupon;
}
