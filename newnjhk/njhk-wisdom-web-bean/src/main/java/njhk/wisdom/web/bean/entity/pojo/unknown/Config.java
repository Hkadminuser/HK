package njhk.wisdom.web.bean.entity.pojo.unknown;

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
public class Config extends DataEntity<Config> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Integer changeByTime;

    @ApiModelProperty(value = "")
    private Integer changeFromPoint;

    @ApiModelProperty(value = "")
    private Integer pointsToCoupon;

    @ApiModelProperty(value = "")
    private Integer regCoupon;

    @ApiModelProperty(value = "")
    private Integer timeToCoupon;
}
