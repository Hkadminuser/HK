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
public class Giftcert extends DataEntity<Giftcert> {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "礼品券名称")
    private String name;

    @ApiModelProperty(value = "兑换券金额")
    private Integer couponMoney;
}
