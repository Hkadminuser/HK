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
public class KnowledgeCategory extends DataEntity<KnowledgeCategory> {
    @ApiModelProperty(value = "业务类别ID")
    private String id;  
    @ApiModelProperty(value = "标识是一级还是二级")
    private Integer knowledgeType;
    @ApiModelProperty(value = "业务类别上级类别")
    private String parentId ;
    @ApiModelProperty(value = "业务类别名称")
    private String categoryName;
    @ApiModelProperty(value = "录入时间")
    private Date entrytime;
  

}
