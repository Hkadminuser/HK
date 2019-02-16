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
public class CustomerPromotion extends DataEntity<CustomerPromotion> {

    @ApiModelProperty(value = "")
    private String ID;

    @ApiModelProperty(value = "")
    private String activity;

    @ApiModelProperty(value = "")
    private Date end;

    @ApiModelProperty(value = "")
    private Date start;
}
