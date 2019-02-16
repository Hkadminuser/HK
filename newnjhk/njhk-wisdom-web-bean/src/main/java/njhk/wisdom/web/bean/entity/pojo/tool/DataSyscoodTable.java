package njhk.wisdom.web.bean.entity.pojo.tool;

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
public class DataSyscoodTable extends DataEntity<DataSyscoodTable> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String sysEndCode;

    @ApiModelProperty(value = "")
    private String tableFlag;

    @ApiModelProperty(value = "")
    private String tableName;
}
