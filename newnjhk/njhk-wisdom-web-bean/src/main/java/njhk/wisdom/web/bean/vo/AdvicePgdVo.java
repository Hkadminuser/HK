package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class AdvicePgdVo {
    @ApiModelProperty(value = "主键ID")
    private String Id;

    @ApiModelProperty(value = "咨询回复")
    private String adviceAnswer;

    @ApiModelProperty(value = "咨询内容")
    private String adviceContent;

    @ApiModelProperty(value = "来电号码")
    private  String callPhone;

    @ApiModelProperty(value = "来电时间")
    private Date callTime;

    @ApiModelProperty(value = "工单号")
    private String ordernum;

    @ApiModelProperty(value = "咨询备注")
    private String remark;

    @ApiModelProperty(value = "受理坐席")
    private String seatNo;

    @ApiModelProperty(value = "录入人员")
    private String seatPerson;

    @ApiModelProperty(value = "咨询类别")
    private String adviceType;

    @ApiModelProperty(value = "普通客户")
    private  String customer;

    @ApiModelProperty(value = "客户姓名")
    private String customerName;

    @ApiModelProperty(value = "社区ID")
    private String communityid;

    @ApiModelProperty(value = "大于来电时间")
    private Date DYcallTime;

    @ApiModelProperty(value = "小于来电时间")
    private Date XYcallTime;
}
