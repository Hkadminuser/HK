package njhk.wisdom.web.bean.entity.other;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;

@ApiModel(description = "")
@Getter
@Setter
@ToString
public class Knowledge extends DataEntity<Knowledge> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "KnowledgeCategory  服务类别")
    private String kind;
    @ApiModelProperty(value = "标题")
    private String title;		
    @ApiModelProperty(value = "内容")
    private String content;	
    @ApiModelProperty(value = "答复")
    private String answer;	
    @ApiModelProperty(value = "备注")
    private String remark;	
    @ApiModelProperty(value = "录入时间")
    private Date entrytime;   
}
