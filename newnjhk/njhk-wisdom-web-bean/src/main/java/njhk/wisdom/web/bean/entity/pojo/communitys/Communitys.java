package njhk.wisdom.web.bean.entity.pojo.communitys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class Communitys extends DataEntity<Communitys> {



    @ApiModelProperty(value = "")
    private String actualOccupancy;

    @ApiModelProperty(value = "")
    private String bedNumber;

    @ApiModelProperty(value = "")
    private String buildingArea;

    @ApiModelProperty(value = "")
    private String communitysAddress;

    @ApiModelProperty(value = "")
    private String communitysHead;

    @ApiModelProperty(value = "")
    private String communitysName;

    @ApiModelProperty(value = "")
    private  String communitysPhone;

    @ApiModelProperty(value = "")
    private  String communitysPhoto;

    @ApiModelProperty(value = "")
    private String communitysType;

    @ApiModelProperty(value = "")
    private String constructionYears;

    @ApiModelProperty(value = "")
    private String housingProperty;

    @ApiModelProperty(value = "")
    private String landProperty;

    @ApiModelProperty(value = "")
    private String managers;

    @ApiModelProperty(value = "")
    private String nature;

    @ApiModelProperty(value = "")
    private String nursings;

    @ApiModelProperty(value = "")
    private String ownership;

    @ApiModelProperty(value = "")
    private String remarks;
}
