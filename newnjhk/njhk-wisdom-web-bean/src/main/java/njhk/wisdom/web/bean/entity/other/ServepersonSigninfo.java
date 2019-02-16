package njhk.wisdom.web.bean.entity.other;

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
public class ServepersonSigninfo extends DataEntity<ServepersonSigninfo> {
    @ApiModelProperty(value = "仅做唯一标识")
    private String id;
    @ApiModelProperty(value = "手机号码")
    private String mobilephone; 
    @ApiModelProperty(value = "积分来源")
    private String nameinfo;
    @ApiModelProperty(value = "积分数目")
    private Integer sign;
    @ApiModelProperty(value = "签到时刻")
    private Date lastSignTime;
    @ApiModelProperty(value = "剩余积分")
    private Integer countsign;
}
