package njhk.wisdom.web.bean.entity.pojo.cusbackcall;

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
public class Cusbackcallplan extends DataEntity<Cusbackcallplan> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String beizhu;

    @ApiModelProperty(value = "")
    private String community;

    @ApiModelProperty(value = "")
    private String content;

    @ApiModelProperty(value = "")
    private Date etime;

    @ApiModelProperty(value = "")
    private String jtlx;

    @ApiModelProperty(value = "")
    private Integer states;

    @ApiModelProperty(value = "")
    private Date stime;

    @ApiModelProperty(value = "")
    private Integer type;

    @ApiModelProperty(value = "")
    private String yhlx;
}
