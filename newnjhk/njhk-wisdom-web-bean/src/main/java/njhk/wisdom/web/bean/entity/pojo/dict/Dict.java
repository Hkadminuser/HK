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
public class Dict extends DataEntity<Dict> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String cloumnName;

    @ApiModelProperty(value = "")
    private String des;

    @ApiModelProperty(value = "")
    private Integer state;

    @ApiModelProperty(value = "")
    private String tableName;

    @ApiModelProperty(value = "")
    private String value;
}
