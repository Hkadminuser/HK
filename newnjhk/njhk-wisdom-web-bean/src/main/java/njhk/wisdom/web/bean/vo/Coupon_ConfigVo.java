package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class Coupon_ConfigVo {
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
