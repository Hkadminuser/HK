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
public class WxSyuserSyorganization extends DataEntity<WxSyuserSyorganization> {
    @ApiModelProperty(value = "")
      private String   sysuser_id;
    @ApiModelProperty(value = "")
      private String syorganization_id;

}
