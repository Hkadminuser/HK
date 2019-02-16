package njhk.wisdom.web.bean.entity.pojo.unknown;

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
public class CallipInfo extends DataEntity<CallipInfo> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Integer clientExtNo;

    @ApiModelProperty(value = "")
    private String clientIp;

    @ApiModelProperty(value = "")
    private Integer clientNo;

    @ApiModelProperty(value = "")
    private Integer clientPassNo;

    @ApiModelProperty(value = "")
    private Integer groupNo;

    @ApiModelProperty(value = "")
    private String serverIP;

    @ApiModelProperty(value = "")
    private Integer serverPort;
}
