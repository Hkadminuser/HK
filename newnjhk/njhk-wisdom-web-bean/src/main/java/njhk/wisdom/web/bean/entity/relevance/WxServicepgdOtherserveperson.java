package njhk.wisdom.web.bean.entity.relevance;

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
public class WxServicepgdOtherserveperson extends DataEntity<WxServicepgdOtherserveperson> {
    @ApiModelProperty(value = "主表id，在从表做唯一性关联")
    private String id;
    @ApiModelProperty(value = "审核状态")
    private String shenStatus;
    @ApiModelProperty(value = "发送时间")
    private Date timeFa;
    @ApiModelProperty(value = "发送内容")
    private String content;
    @ApiModelProperty(value = "发送范围，如果是单个号码就保存单个号码。如果是区域发送，就保存区域")
    private String tranSmissionRange;
    @ApiModelProperty(value = "请求人")
    private String tranSmissionUser;
    @ApiModelProperty(value = "审核人")
    private String shenUser;
}
