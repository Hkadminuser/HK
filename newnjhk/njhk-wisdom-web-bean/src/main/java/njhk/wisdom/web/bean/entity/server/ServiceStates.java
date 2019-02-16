package njhk.wisdom.web.bean.entity.server;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class ServiceStates {
    private  String orderNumbers;
    private  String states;

}
