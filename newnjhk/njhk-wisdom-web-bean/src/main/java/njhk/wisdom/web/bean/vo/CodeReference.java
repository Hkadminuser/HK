package njhk.wisdom.web.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
import njhk.wisdom.web.bean.entity.address.Address;


@ApiModel(description = "")
@Getter
@Setter
@ToString
public class CodeReference extends DataEntity<CodeReference> {
    @ApiModelProperty(value = "主键")
    private String id;
    @ApiModelProperty(value = "对应地址信息")
    private Address address;
    @ApiModelProperty(value = "服务站当前id")
    private Integer serveStationId;
    @ApiModelProperty(value = "服务人员当前id")
    private Integer servePersonId;
    @ApiModelProperty(value = "客户当前id")
    private Integer customerId;
}
