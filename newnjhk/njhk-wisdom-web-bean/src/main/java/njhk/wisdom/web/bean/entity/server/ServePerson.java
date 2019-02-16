package njhk.wisdom.web.bean.entity.server;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;

import java.util.Date;

@ApiModel(description = "服务人员信息")
@Getter
@Setter
@ToString
public class ServePerson  extends DataEntity<ServePerson> {
    @ApiModelProperty(value = "员工id")
    private String id;
    @ApiModelProperty(value = "员工号")
    private String workNo;
    @ApiModelProperty(value = "手机号码")
    private String mobilePhone;
    @ApiModelProperty(value = "家庭电话")
    private String familyPhone;
    @ApiModelProperty(value = "民族")
    private String nation;
    @ApiModelProperty(value = "服务人员社区地址ID")
    private String statSheQuId;
    @ApiModelProperty(value = "服务人员社区地址")
    private String statSheQuName;
    @ApiModelProperty(value = "员工职位")
    private String position;
    @ApiModelProperty(value = "详细地址")
    private String address;
    @ApiModelProperty(value = "服务类型")
    private String serveType;
    @ApiModelProperty(value = "身份证号")
    private String idCard;
    @ApiModelProperty(value = "录入时间")
    private Date entryTime;
    @ApiModelProperty(value = "所属服务站点ID")
    private String serviceStation;
    @ApiModelProperty(value = "二维码")
    private String photob;
    @ApiModelProperty(value = "评分")
    private double grade;
    @ApiModelProperty(value = "停用")
    private Integer nonUse;
    @ApiModelProperty(value = "")
    private String advantage;
    @ApiModelProperty(value = "")
    private String availableTime;
    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern = "yyyy-MM-dd" ,timezone = "GMT+8")
    private Date birthday;
    @ApiModelProperty(value = "")
    private String educationalBackground;
    @ApiModelProperty(value = "")
    private Double fee;
    @ApiModelProperty(value = "")
    private Integer level;
    @ApiModelProperty(value = "")
    private String nativePlace;
    @ApiModelProperty(value = "")
    private Integer points;
    @ApiModelProperty(value = "")
    private Integer workExperience;
    @ApiModelProperty(value = "")
    private String totalEstimate;
    @ApiModelProperty(value = "")
    private String avgEstimate;
    @ApiModelProperty(value = "经度")
    private Double longitude;
    @ApiModelProperty(value = "纬度")
    private Double latitude;
    @ApiModelProperty(value = "上次签到时刻")
    private Date lastSignTime;
    @ApiModelProperty(value = "政府免费的的次数数")
    private Integer freeCount;
    private Date lastPostionTime;
    @ApiModelProperty(value = "服务组;")
    private String serviceGroup;
    @ApiModelProperty(value = "同步码")
    private String sysEndCood;
    @ApiModelProperty(value = "员工姓名")
    private String name;


    @ApiModelProperty(value = "所属服务站点名称")
    private String serviceStationName;

    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "市")
    private String shiID;
    @ApiModelProperty(value = "市")
    private String shiName;
    @ApiModelProperty(value = "区")
    private String quID;
    @ApiModelProperty(value = "区")
    private String quName;
    @ApiModelProperty(value = "街道")
    private String jiedaoID;
    @ApiModelProperty(value = "街道")
    private String jiedaoName;
    @ApiModelProperty(value = "社区")
    private String shequID;
    @ApiModelProperty(value = "社区")
    private String shequName;

    private String loginName;
}
