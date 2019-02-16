package njhk.wisdom.web.bean.entity.pojo.age;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

@ApiModel(description = "年龄限定表")
@Getter
@Setter
@ToString
public class AgeLimit extends DataEntity<AgeLimit>{
    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "限定年龄")
    private Integer age;

    @ApiModelProperty(value = "设置权限判断中间字段")
    private String aid;

    @ApiModelProperty(value = "所属县级")
    private String addressid;
}
