package njhk.wisdom.web.bean.entity.server;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

@ApiModel(description = "服务组信息")
@Getter
@Setter
@ToString
public class ServeGroup extends DataEntity<ServeGroup> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "主要服务人员的id")
    private String servePersonsId;
    @ApiModelProperty(value = "组编号")
    private String groupNo;
    @ApiModelProperty(value = "从属服务人员的id")
    private String otherServePersonsId;
    private long r;


    private String mainName;//主要服务人员姓名
    private String mainPhone;//主要服务人员电话
    private String mainstation;//主要服务人员站点
    private String followName;//从属服务人员姓名
    private String followPhone;//从属服务人员电话
    private String followstation;//从属服务人员站点

}
