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
public class Goods extends DataEntity<Goods> {

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "商品类别")
    private String kind;

    @ApiModelProperty(value = "商品库存")
    private Integer count;

    @ApiModelProperty(value = "单价")
    private Float price;

    @ApiModelProperty(value = "成本价")
    private Float cbprice;

    @ApiModelProperty(value = "录入时间")
    private Date entrytime;
}
