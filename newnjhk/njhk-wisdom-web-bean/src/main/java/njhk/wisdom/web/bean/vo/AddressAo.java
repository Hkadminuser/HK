package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "地址信息表")
@Getter
@Setter
@ToString
public class AddressAo {

    @ApiModelProperty(value = "主键id")
    private String id;

    @ApiModelProperty(value = "地址名")
    private String addressName;
}
