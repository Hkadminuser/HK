package njhk.wisdom.web.bean.entity.server;

import njhk.wisdom.web.bean.common.persistence.DataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "服务站信息")
@Getter
@Setter
@ToString
public class ServeStation extends DataEntity<ServeStation> {
    @ApiModelProperty(value = "1.为加盟商，其他为服务站")
    private Integer type;
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "服务站编号")
    private String statNum;
    @ApiModelProperty(value = "服务站名称")
    private String statname;
    @ApiModelProperty(value = "服务站类型")
    private String statType;
    @ApiModelProperty(value = "服务站社区地址ID")
    private String statSheQuId;
    @ApiModelProperty(value = "详细地址")
    private String address;
    @ApiModelProperty(value = "设备码")
    private String eqptNum;
    @ApiModelProperty(value = "固定电话")
    private String phone;
    @ApiModelProperty(value = "站长")
    private String  firstAgent;
    @ApiModelProperty(value = "副站长")
    private String secondAgent;
    @ApiModelProperty(value = "服务站经度")
    private Double addressLat;
    @ApiModelProperty(value = "服务站纬度")
    private Double addressLng;
    @ApiModelProperty(value = "照片")
    private String photo;
    @ApiModelProperty(value = "二维码")
    private String photob;
    @ApiModelProperty(value = "评分")
    private Integer grade;
    @ApiModelProperty(value = "停用")
    private Integer nonUse;
    @ApiModelProperty(value = "服务项目")
    private String serveProject;
    @ApiModelProperty(value = "联系人")
    private String contact;
    @ApiModelProperty(value = "联系电话")
    private String contactPhone;
    @ApiModelProperty(value = "是否上门1.是，2.否。")
    private String door;
    @ApiModelProperty(value = "同步码")
    private String sysEndCood;

}
