package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class CustomerType extends DataEntity<CustomerType> {
    private String id;
    private String name;
    private String eqptNum;
}
