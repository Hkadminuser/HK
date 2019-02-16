package njhk.wisdom.web.bean.entity.relevance;

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
public class WxServetypeServestation extends DataEntity<WxServetypeServestation> {
    @ApiModelProperty(value = "")
    private String serveType_id;
    @ApiModelProperty(value = "")
    private String serveStation_id;

}
