package njhk.wisdom.web.bean.entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@ApiModel(description = "")
@Getter
@Setter
@ToString
public class Excel extends DataEntity<Excel> {

    private String name;

    private String phone;

    private String[] ad;

}
