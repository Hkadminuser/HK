package njhk.wisdom.web.bean.entity.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;
@ApiModel(description = "上传坐标信息")
@Getter
@Setter
@ToString
public class Point extends DataEntity<Point> {
    @ApiModelProperty(value = "手机号码")
    private String mobilePhone;
    @ApiModelProperty(value = "经度")
    private String latitude;
    @ApiModelProperty(value = "纬度")
    private String longitude;

}
