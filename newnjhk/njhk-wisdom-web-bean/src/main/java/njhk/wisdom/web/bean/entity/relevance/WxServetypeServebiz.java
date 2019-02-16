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
public class WxServetypeServebiz extends DataEntity<WxServetypeServebiz> {
    @ApiModelProperty(value = "")
   private String secebiz_id;
    @ApiModelProperty(value = "")
   private String serveType_id;

}
