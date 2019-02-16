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
public class CustomerVisitInfo extends DataEntity<CustomerVisitInfo> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Date deleteTime;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String note;

    @ApiModelProperty(value = "")
    private Integer validFlag;

    @ApiModelProperty(value = "")
    private String visitTypeId;
}
