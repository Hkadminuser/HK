package njhk.wisdom.web.bean.entity.other;

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
public class ServepersonSuggestion extends DataEntity<ServepersonSuggestion> {
    @ApiModelProperty(value = "")
    private String id;
    @ApiModelProperty(value = "")
    private String person;
    @ApiModelProperty(value = "")
    private String suggestion;

}
