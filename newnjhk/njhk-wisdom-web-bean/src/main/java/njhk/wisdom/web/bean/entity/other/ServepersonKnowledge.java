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
public class ServepersonKnowledge extends DataEntity<ServepersonKnowledge> {
    @ApiModelProperty(value = "")
    private String id;
    @ApiModelProperty(value = "")
    private String  person;
    @ApiModelProperty(value = "")
    private String title;
    @ApiModelProperty(value = "")
    private String content;
    @ApiModelProperty(value = "")
    private Date time;
}
