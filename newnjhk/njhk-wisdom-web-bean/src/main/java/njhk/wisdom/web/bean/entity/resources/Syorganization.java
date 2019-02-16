package njhk.wisdom.web.bean.entity.resources;

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
public class Syorganization extends DataEntity<Syorganization> {
    @ApiModelProperty(value = "")
    private String id;
    @ApiModelProperty(value = "")
    private Date createDateTime;
    @ApiModelProperty(value = "")
    private Date updateDatetime;
    @ApiModelProperty(value = "")
    private String name;
    @ApiModelProperty(value = "")
    private String address;
    @ApiModelProperty(value = "")
    private String code;
    @ApiModelProperty(value = "")
    private String iconCls;
    @ApiModelProperty(value = "")
    private Integer seq;
    @ApiModelProperty(value = "")
    private String syoganization_id; //父
}
