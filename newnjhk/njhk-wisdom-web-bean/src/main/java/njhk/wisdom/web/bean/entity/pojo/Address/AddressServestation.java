package njhk.wisdom.web.bean.entity.pojo.Address;

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
public class AddressServestation extends DataEntity<AddressServestation> {

    @ApiModelProperty(value = "")
    private String SERVESTATION_ID;

    @ApiModelProperty(value = "")
    private String ADDRESS_ID;
}
