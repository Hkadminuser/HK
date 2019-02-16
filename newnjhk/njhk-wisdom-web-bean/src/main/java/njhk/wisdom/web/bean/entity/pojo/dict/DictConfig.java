package njhk.wisdom.web.bean.entity.pojo.dict;

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
public class DictConfig extends DataEntity<DictConfig> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String dicName;

    @ApiModelProperty(value = "")
    private String dicType;

    @ApiModelProperty(value = "")
    private String dicVal;
}
