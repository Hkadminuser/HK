package njhk.wisdom.web.bean.entity.address;

import njhk.wisdom.web.bean.common.persistence.DataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "地址信息表")
@Getter
@Setter
@ToString
public class Address extends DataEntity<Address> {
    @ApiModelProperty(value = "用于获得当前地址的父机构ID")
    private String pid;
    @ApiModelProperty(value = "用于获得当前地址的子地址数量")
    private Integer chnum;
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "地址编码")
    private String ano;
    @ApiModelProperty(value = "地址名")
    private String addressName;
    @ApiModelProperty(value = "1-市，2-区，3-街道，4-社区，5-标志建筑")
    private Integer addressType;

    private Integer del;

    private String organizationCode;
    private String parentId;


    private String sysEndCood;
}
