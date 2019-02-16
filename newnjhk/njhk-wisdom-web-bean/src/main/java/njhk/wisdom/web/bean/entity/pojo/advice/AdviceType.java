package njhk.wisdom.web.bean.entity.pojo.advice;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;

@ApiModel(description = "咨询类别")
@Getter
@Setter
@ToString
public class AdviceType extends DataEntity<AdviceType> {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "录入时间")
    private Date entrytime;

    @ApiModelProperty(value = "咨询类别名称")
    private String typeName;
}
