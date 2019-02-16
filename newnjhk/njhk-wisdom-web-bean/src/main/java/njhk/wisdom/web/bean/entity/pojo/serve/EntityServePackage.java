package njhk.wisdom.web.bean.entity.pojo.serve;

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
public class EntityServePackage extends DataEntity<EntityServePackage> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String degreeDif;

    @ApiModelProperty(value = "")
    private Integer labourHours;

    @ApiModelProperty(value = "")
    private String packageName;

    @ApiModelProperty(value = "")
    private String remarks;
}
