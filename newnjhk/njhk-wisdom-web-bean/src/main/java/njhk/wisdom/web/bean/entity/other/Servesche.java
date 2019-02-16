package njhk.wisdom.web.bean.entity.other;

import io.swagger.annotations.ApiModelProperty;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;

public class Servesche extends DataEntity<Servesche> {
    @ApiModelProperty(value = "")
    private String id;
    @ApiModelProperty(value = "")
    private Date start;
    @ApiModelProperty(value = "")
    private Date end;
    @ApiModelProperty(value = "")
    private String person;

}
