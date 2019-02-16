package njhk.wisdom.web.bean.entity.pojo.serve;

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
public class EntityServePackageServeProduct extends DataEntity<EntityServePackageServeProduct> {

    @ApiModelProperty(value = "")
    private String wx_entityServePackage_id;

    @ApiModelProperty(value = "")
    private String wx_serveProduct_id;
}
