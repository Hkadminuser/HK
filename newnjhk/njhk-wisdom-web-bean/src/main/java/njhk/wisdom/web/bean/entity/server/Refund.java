package njhk.wisdom.web.bean.entity.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@ApiModel(description = "商家信息")
@Getter
@Setter
@ToString
public class Refund extends DataEntity<Refund> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "hasResponsed为0时：0-发起退款失败，1-发起退款成功；hasResponsed为1时：0-退款失败，1-退款成功")
    private Integer succeed;//
    @ApiModelProperty(value = "退款失败的描述")
    private String failMsg;//
    @ApiModelProperty(value = "工单id")
    private String pgd;
    @ApiModelProperty(value = "0-未返回，1-已经返回")
    private Integer hasResponsed;//

}
