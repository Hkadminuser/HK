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
public class CustomerReturnVisit extends DataEntity<CustomerReturnVisit> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Date visitTime;

    @ApiModelProperty(value = "")
    private String note;

    @ApiModelProperty(value = "")
    private String customerId;

    @ApiModelProperty(value = "")
    private String visitTypeId;

    @ApiModelProperty(value = "")
    private Integer visitLevel;
}
