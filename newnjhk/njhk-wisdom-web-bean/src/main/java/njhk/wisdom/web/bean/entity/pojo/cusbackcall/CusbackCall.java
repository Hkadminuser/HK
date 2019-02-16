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
public class CusbackCall extends DataEntity<CusbackCall> {

    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private Date aphftime;

    @ApiModelProperty(value = "")
    private Date hftime;

    @ApiModelProperty(value = "")
    private String record;

    @ApiModelProperty(value = "")
    private Integer sfback;

    @ApiModelProperty(value = "")
    private Integer sfjt;

    @ApiModelProperty(value = "")
    private String customer;

    @ApiModelProperty(value = "")
    private String hfr;

    @ApiModelProperty(value = "")
    private String planId;
}
