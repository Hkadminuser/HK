package njhk.wisdom.web.bean.entity.pojo.goods;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class GoodsCategory extends DataEntity<GoodsCategory> {

    @ApiModelProperty(value = "id")
    private String id; //商品类别ID

    @ApiModelProperty(value = "id")
    private GoodsCategory parentId;//商品类别上级类别

    @ApiModelProperty(value = "id")
    private Integer goodsType;//标识是一级还是二级

    @ApiModelProperty(value = "id")
    private String categoryName;//商品类别名称

    @ApiModelProperty(value = "id")
    private Date entrytime;//录入时间

}
