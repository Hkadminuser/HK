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
public class AddressServeperson extends DataEntity<AddressServeperson> {

    @ApiModelProperty(value = "")
    private String SERVEPERSON_ID;

    @ApiModelProperty(value = "")
    private String ADDRESS_ID;
}
