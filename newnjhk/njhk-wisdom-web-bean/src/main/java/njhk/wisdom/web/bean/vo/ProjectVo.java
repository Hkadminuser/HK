package njhk.wisdom.web.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 设备实体
 * @author xiangzhangshu
 * @version 2017-11-11
 */
@ApiModel(description = "设备信息")
@Getter
@Setter
@ToString
public class ProjectVo {

	private static final long	serialVersionUID	= 1L;
	@ApiModelProperty(value = "项目编号")
	private String projectCode;
	@ApiModelProperty(value = "项目名称")
	private String projectName;
	@ApiModelProperty(value = "项目详情")
	private String projectDetail;
	@ApiModelProperty(value = "竣工时间")
	@JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
	private Date projectEndTime;
	@ApiModelProperty(value = "项目地址")
	private String projectAddress;
	@ApiModelProperty(value = "设计单位")
	private String projectOrg;
	@ApiModelProperty(value = "建设单位")
	private String buildOrg;
	@ApiModelProperty(value = "施工单位")
	private String constructOrg;
}
