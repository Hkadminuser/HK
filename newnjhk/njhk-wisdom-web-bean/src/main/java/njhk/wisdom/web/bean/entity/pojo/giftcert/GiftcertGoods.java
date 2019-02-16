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
public class GiftcertGoods extends DataEntity<GiftcertGoods> {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "礼品券")
    private String giftCert;

    @ApiModelProperty(value = "商品")
    private String goods;

    @ApiModelProperty(value = "商品数量")
    private Integer count;
}
