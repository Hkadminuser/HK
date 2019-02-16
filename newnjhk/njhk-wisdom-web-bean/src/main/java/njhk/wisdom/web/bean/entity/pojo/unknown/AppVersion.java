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
public class AppVersion extends DataEntity<AppVersion> {
    @ApiModelProperty(value = "")
    private String customerVersion;

    @ApiModelProperty(value = "")
    private String servantVersion;

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Date uploadTime;

    @ApiModelProperty(value = "")
    private String user;

    @ApiModelProperty(value = "")
    private String customerUrl;

    @ApiModelProperty(value = "")
    private String servantUrl;

    @ApiModelProperty(value = "")
    private String customerVersionIphone;

    @ApiModelProperty(value = "")
    private String servantVersionIphone;

    @ApiModelProperty(value = "")
    private String servantVersionIphoneUrl;

    @ApiModelProperty(value = "")
    private String customerVersionIphoneUrl;

    @ApiModelProperty(value = "")
    private String customerUrlIphone;

    @ApiModelProperty(value = "")
    private String servantUrlIphone;
}
