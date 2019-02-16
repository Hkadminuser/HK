package njhk.wisdom.web.bean.entity.other;

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
public class Insurance extends DataEntity<Insurance> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "")
    private String name;
    @ApiModelProperty(value = "")
    private String map;
    @ApiModelProperty(value = "")
    private String des;
    @ApiModelProperty(value = "")
    private Integer points;
    @ApiModelProperty(value = "")
    private Date createTime;
}
