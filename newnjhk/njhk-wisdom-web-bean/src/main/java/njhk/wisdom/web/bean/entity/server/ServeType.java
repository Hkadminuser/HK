package njhk.wisdom.web.bean.entity.server;

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
public class ServeType extends DataEntity<ServeType> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "虚拟属性，用于获得当前地址的父机构ID")
    private String pid;
    @ApiModelProperty(value = "上级类别ID")
    private ServeType serveType;
    @ApiModelProperty(value = "类型级别")
    private Integer typeLevel;
    @ApiModelProperty(value = "类型名称")
    private String typeName;
    @ApiModelProperty(value = "说明")
    private String beizhu;
    @ApiModelProperty(value = "子节点数量")
    private Integer childTypesNum;


}
