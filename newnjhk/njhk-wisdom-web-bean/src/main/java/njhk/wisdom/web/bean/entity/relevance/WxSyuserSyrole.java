package njhk.wisdom.web.bean.entity.relevance;

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
public class WxSyuserSyrole extends DataEntity<WxSyuserSyrole> {
    @ApiModelProperty(value = "角色表id")
    private String syuser_id;
    @ApiModelProperty(value = "权限表id")
    private String syrole_id;

}
