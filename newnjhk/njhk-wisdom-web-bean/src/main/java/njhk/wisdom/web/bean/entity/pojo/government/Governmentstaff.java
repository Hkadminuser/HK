package njhk.wisdom.web.bean.entity.pojo.government;

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
public class Governmentstaff extends DataEntity<Governmentstaff> {

    @ApiModelProperty(value = "id")
    private String ID;

    @ApiModelProperty(value = "id")
    private Integer type;

    @ApiModelProperty(value = "所属社区")
    private String community;

    @ApiModelProperty(value = "手机号")
    private String mobilephone;

    @ApiModelProperty(value = "电子邮件")
    private String email;
}
