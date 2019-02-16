package njhk.wisdom.web.bean.entity.customer;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class CustomerStates {
    private  String states;
    private  String customerNumbers;
}
