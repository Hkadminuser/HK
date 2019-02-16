package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModelProperty;

public class LiveHomeVo {

    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "联系人")
    private String name;
    @ApiModelProperty(value = "联系方式")
    private String phone;
    @ApiModelProperty(value = "分公司名")
    private String nameID;
    @ApiModelProperty(value = "职位")
    private String place;
    @ApiModelProperty(value = "分公司访问地址")
    private String addressIP;
    @ApiModelProperty(value = "分公司详细地址")
    private String address;
    @ApiModelProperty(value = "分公司图片")
    private String photo;
    @ApiModelProperty(value = "类型")
    private String type;
}
