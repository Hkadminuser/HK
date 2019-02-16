package njhk.wisdom.web.bean.entity.pojo.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
import njhk.wisdom.web.bean.entity.pojo.cusbackcall.Customer;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class FimiticCustomer extends DataEntity<FimiticCustomer> {

    @ApiModelProperty(value = "代理主键")
    private	String id;

    @ApiModelProperty(value = "客户信息")
    private Customer customer;

    @ApiModelProperty(value = "已消费金额")
    private Double spendMoney;

    @ApiModelProperty(value = "账户余额")
    private Double haveMoney;
}
