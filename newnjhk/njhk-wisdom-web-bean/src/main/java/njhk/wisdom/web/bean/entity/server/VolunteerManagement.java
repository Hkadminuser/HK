package njhk.wisdom.web.bean.entity.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

@ApiModel(description = "志愿者信息")
@Getter
@Setter
@ToString
public class VolunteerManagement extends DataEntity<VolunteerManagement> {
    @ApiModelProperty(value = "志愿者ID")
    private String id;
    @ApiModelProperty(value = "公司")
    private String company;
    @ApiModelProperty(value = "志愿者学历 1.高中2.专科3.本科4.研究生5.博士")
    private Integer education;
    @ApiModelProperty(value = "身份证号")
    private String idcard;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "民族")
    private String nation;
    @ApiModelProperty(value = "政治面貌1.团员2.党员3.其他")
    private Integer political;
    @ApiModelProperty(value = "志愿者性别1.男，2.女")
    private Integer  sex;
    @ApiModelProperty(value = "电话号码")
    private String telephone;

}
