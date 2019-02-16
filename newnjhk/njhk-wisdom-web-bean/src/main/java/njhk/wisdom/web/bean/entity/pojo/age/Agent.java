package njhk.wisdom.web.bean.entity.pojo.age;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

@ApiModel(description = "坐席人员表")
@Getter
@Setter
@ToString
public class Agent extends DataEntity<Agent> {
    @ApiModelProperty(value = "")
    private String iD;

    @ApiModelProperty(value = "坐席编号，分机号")
    private  String agentExt;

    @ApiModelProperty(value = "坐席通道，默认为1。大唐话务系统登录操作没有此项")
    private  String agentChannel;

    @ApiModelProperty(value = "业务组号，默认为1")
    private  String agentGroupId;

    @ApiModelProperty(value = "ACD服务器IP")
    private  String agentAcdIp;

    @ApiModelProperty(value = "ACD服务器端口号")
    private String agentAcdPort;

    @ApiModelProperty(value = "技能级别，即坐席等级，默认为0")
    private Integer agentLevel;

    @ApiModelProperty(value = "坐席权限:0-普通坐席，1-班长坐席")
    private Integer agentRight;
}
