package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.entity.server.ServeType;
@ApiModel(description = "")
@Getter
@Setter
@ToString
public class ServeTypeVo {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "类型名称")
    private String typeName;

}
