package njhk.wisdom.web.bean.entity.pojo.sms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;
@ApiModel(description = "咨询工单表")
@Getter
@Setter
@ToString
public class Sms extends DataEntity<Sms> {

    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "")
    private String phone;

    @ApiModelProperty(value = "")
    private String content;

    @ApiModelProperty(value = "")
    private Date time;

    @ApiModelProperty(value = "")
    private Integer success;

    @ApiModelProperty(value = "")
    private String reason;

    @ApiModelProperty(value = "")
    private String smsShen;
}
