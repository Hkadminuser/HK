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
public class CustomerOperation extends DataEntity<CustomerOperation> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Integer type;

    @ApiModelProperty(value = "")
    private String customerId;

    @ApiModelProperty(value = "")
    private String syuserId;
}
