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
public class Syonline extends DataEntity<Syonline> {
    @ApiModelProperty(value = "")
    private String id;
    @ApiModelProperty(value = "")
    private String loginname;
    @ApiModelProperty(value = "")
    private String ip;
    @ApiModelProperty(value = "")
    private Date createdatetime;
    @ApiModelProperty(value = "1.登录0.注销")
    private String type;
}
