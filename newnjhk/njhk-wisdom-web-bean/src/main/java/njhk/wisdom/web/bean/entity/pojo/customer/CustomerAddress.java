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
public class CustomerAddress extends DataEntity<CustomerAddress> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String customer;

    @ApiModelProperty(value = "")
    private String address;
}
