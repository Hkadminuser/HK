package njhk.wisdom.web.bean.entity.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.HashSet;
import java.util.Set;

@ApiModel(description = "服务内容信息")
@Getter
@Setter
@ToString
public class ServeProduct extends DataEntity<ServeProduct> {
    @ApiModelProperty(value = "员工号")
    private String id;
    @ApiModelProperty(value = "第一服务类型")
    private String  firstType;
    @ApiModelProperty(value = "第一服务类型")
    private String  firstName;
    @ApiModelProperty(value = "第二服务类型")
    private String secondType;
    @ApiModelProperty(value = "第二服务类型")
    private String secondName;
    @ApiModelProperty(value = "第三服务类型")
    private String thirdType;
    @ApiModelProperty(value = "产品名称")
    private String productname;
    @ApiModelProperty(value = "产品价格")
    private String price;
    @ApiModelProperty(value = "参考工时")
    private String referTime;
    @ApiModelProperty(value = "产品说明")
    private String produce;
    @ApiModelProperty(value = "难度系数")
    private String degreeDif;

    private Set<ServicePgd> orders = new HashSet<ServicePgd>(0);
    @ApiModelProperty(value = "同步码")
    private String sysEndCood;
}
