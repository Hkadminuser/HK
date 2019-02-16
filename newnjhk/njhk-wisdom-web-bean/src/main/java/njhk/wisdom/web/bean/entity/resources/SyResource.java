package njhk.wisdom.web.bean.entity.resources;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;
import java.util.List;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class SyResource extends DataEntity<SyResource> {
    @ApiModelProperty(value = "")
    private String id;
    @ApiModelProperty(value = "")
    private Date createDateTime;
    @ApiModelProperty(value = "")
    private Date updateDateTime;;
    @ApiModelProperty(value = "")
    private String name;
    @ApiModelProperty(value = "")
    private String url;
    @ApiModelProperty(value = "")
    private String description;
    @ApiModelProperty(value = "")
    private String iconCls;
    @ApiModelProperty(value = "")
    private Integer seq;
    @ApiModelProperty(value = "")
    private String syResource_id;
    @ApiModelProperty(value = "")
    private String syResourceType_id;

    private List<SyRole> roles;
}
