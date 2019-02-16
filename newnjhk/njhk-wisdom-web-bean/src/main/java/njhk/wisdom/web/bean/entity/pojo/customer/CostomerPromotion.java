package njhk.wisdom.web.bean.entity.pojo.customer;

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
public class CostomerPromotion extends DataEntity<CostomerPromotion> {

    @ApiModelProperty(value = "")
    private String customer_id;

    @ApiModelProperty(value = "")
    private String promotion_id;

}
