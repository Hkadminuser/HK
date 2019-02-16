package njhk.wisdom.web.bean.entity.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@ApiModel(description = "服务对象信息")
@Getter
@Setter
@ToString
public class Institutions extends DataEntity<Institutions> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "机构名称")
    private String institutionName;
    @ApiModelProperty(value = "机构详细地址")
    private String institutionAddress;
    @ApiModelProperty(value = "机构负责人")
    private String institutionHead;
    @ApiModelProperty(value = "机构图片")
    private String institutionPhoto;
    @ApiModelProperty(value = "负责人电话")
    private String headPhone;
    @ApiModelProperty(value = "机构类型")
    private String institutionType;
    @ApiModelProperty(value = "性质（0.公建公营、1.社会办、2.公建民营）")
    private String nature;
    @ApiModelProperty(value = "建筑面积")
    private String buildingArea;
    @ApiModelProperty(value = "房屋性质（0.自建、1.租赁）")
    private String housingProperty;
    @ApiModelProperty(value = "土地性质（0.划拨、1.有偿出让）")
    private String landProperty;
    @ApiModelProperty(value = "房产所有权属")
    private String ownership;
    @ApiModelProperty(value = "建设年份")
    private String constructionYears;
    @ApiModelProperty(value = "总床位数")
    private String bedNumber;
    @ApiModelProperty(value = "实际入住人数")
    private String actualOccupancy;
    @ApiModelProperty(value = "管理人员数(从业人员人数)")
    private String managers;
    @ApiModelProperty(value = "护理人员数(从业人员人数)")
    private String nursings;
    @ApiModelProperty(value = "备注")
    private String remarks;
}
