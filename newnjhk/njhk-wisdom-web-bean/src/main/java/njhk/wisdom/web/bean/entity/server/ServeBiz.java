package njhk.wisdom.web.bean.entity.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@ApiModel(description = "商家信息")
@Getter
@Setter
@ToString
public class ServeBiz extends DataEntity<ServeBiz> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "商家编号")
    private String bizNum;				
    @ApiModelProperty(value = "商家名称")
    private String bizName;				
    @ApiModelProperty(value = "商家性质0:个人，1:单位") 
    private String bizType;
    @ApiModelProperty(value = "商家区地址ID")
    private String bizQuId;
    @ApiModelProperty(value = "商家街道地址ID")
    private String bizJieDaoId;
    @ApiModelProperty(value = "商家社区地址ID")
    private String bizSheQuId;
    @ApiModelProperty(value = "详细地址")
    private String address;				
    @ApiModelProperty(value = "商家联系人")
    private String bizPersonName;		
    @ApiModelProperty(value = "商家联系电话")
    private String bizPersonPhone;		
    @ApiModelProperty(value = "照片")
    private String photo;
    @ApiModelProperty(value = "二维码")
    private String photob;
    @ApiModelProperty(value = "商家经度")
    private Double addressLat;
    @ApiModelProperty(value = "商家纬度")
    private Double addressLng;
    @ApiModelProperty(value = "评分")
    private Integer grade;
}
