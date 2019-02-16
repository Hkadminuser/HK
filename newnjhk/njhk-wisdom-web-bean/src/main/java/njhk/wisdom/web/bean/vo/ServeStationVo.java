package njhk.wisdom.web.bean.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "服务站信息")
@Getter
@Setter
@ToString
public class ServeStationVo {
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
    @ApiModelProperty(value = "区县")
    private String zone;
    @ApiModelProperty(value = "街道")
    private String street;
    @ApiModelProperty(value = "社区")
    private String shequ;
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
    @ApiModelProperty(value = "联系人")
    private String contact;
    @ApiModelProperty(value = "联系电话")
    private String contactPhone;

}
