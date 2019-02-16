package njhk.wisdom.web.bean.entity.pojo.goods;

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
public class Goodspgd extends DataEntity<Goodspgd> {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "姓名")
    private String Name;

    @ApiModelProperty(value = "黑名单号码或字冠")
    private String TeleCode;

    @ApiModelProperty(value = "否/是")
    private String Flag;

    @ApiModelProperty(value = "")
    private String Remark;
}
