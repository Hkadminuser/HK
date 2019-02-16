package njhk.wisdom.web.bean.entity.pojo.unknown;

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
public class Tbmisscall extends DataEntity<Tbmisscall> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Date callTime;

    @ApiModelProperty(value = "")
    private String extNum;

    @ApiModelProperty(value = "")
    private String recdFile;

    @ApiModelProperty(value = "")
    private String serialNo;

    @ApiModelProperty(value = "")
    private Integer srvType;

    @ApiModelProperty(value = "")
    private String teleNo;

    @ApiModelProperty(value = "")
    private Integer timeId;

    @ApiModelProperty(value = "")
    private String voiceflag;
}
