package njhk.wisdom.web.bean.entity.pojo.unknown;

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
public class Tbcalllist extends DataEntity<Tbcalllist> {


            @ApiModelProperty(value = "")
            private  String id;

            @ApiModelProperty(value = "")
            private Integer ansId;

            @ApiModelProperty(value = "")
            private Date ansTime;

            @ApiModelProperty(value = "")
            private Integer callInOut;

            @ApiModelProperty(value = "")
            private  Date callTime;

            @ApiModelProperty(value = "")
            private  Integer chnNo;

            @ApiModelProperty(value = "")
            private  Integer chnType;

            @ApiModelProperty(value = "")
            private  String ExtNum;

            @ApiModelProperty(value = "")
            private  String recdFile;

           @ApiModelProperty(value = "")
           private String recfileRemark;

           @ApiModelProperty(value = "")
            private  Date relTime;

           @ApiModelProperty(value = "")
            private  String SeatNo;

           @ApiModelProperty(value = "")
            private  String serialNo;

           @ApiModelProperty(value = "")
            private  String WorkerNo;

}
