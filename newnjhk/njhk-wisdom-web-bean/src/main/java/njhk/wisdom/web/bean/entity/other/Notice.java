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
public class Notice extends DataEntity<Notice> {
    @ApiModelProperty(value = "主建id")
    private String id;
    @ApiModelProperty(value = "发布人")
    private String noSeatName;		
    @ApiModelProperty(value = "发布公告的坐席")
    private String noSeatId;			
    @ApiModelProperty(value = "发布时间")
    private Date noTime;				            
    @ApiModelProperty(value = "公告内容")
    private String noContent;		
    @ApiModelProperty(value = "公告备注")
    private String noRemark;	

}
