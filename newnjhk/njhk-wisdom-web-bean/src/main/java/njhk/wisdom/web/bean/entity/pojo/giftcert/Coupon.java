package njhk.wisdom.web.bean.entity.pojo.giftcert;

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
public class Coupon extends DataEntity<Coupon> {

    @ApiModelProperty(value = "")
    private String ID;

    @ApiModelProperty(value = "")
    private Date BEGINTIME;

    @ApiModelProperty(value = "")
    private String COMMODITYNAME;

    @ApiModelProperty(value = "")
    private Integer COUPONMONEY;

    @ApiModelProperty(value = "")
    private String COUPONNUM;

    @ApiModelProperty(value = "")
    private String COUPONSTATE;

    @ApiModelProperty(value = "")
    private Date ENDTIME;
}
