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
public class CustomerWxServicepgd extends DataEntity<CustomerWxServicepgd> {

    @ApiModelProperty(value = "")
    private String wx_customer_ID;

    @ApiModelProperty(value = "")
    private String orders_id;
}
