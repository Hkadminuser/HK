package njhk.wisdom.web.bean.entity.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@ApiModel(description = "服务对象信息")
@Getter
@Setter
@ToString
public class MedicalExaminationReports extends DataEntity<MedicalExaminationReports> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "")
    private String sequences;
    @ApiModelProperty(value = "用户头像")
    private String photoPath;
    @ApiModelProperty(value = "用户id")
    private String userId;
    @ApiModelProperty(value = "报告id")
    private String reportId;
    @ApiModelProperty(value = "单位名称")
    private String hospitalName;
    @ApiModelProperty(value = "单位地址")
    private String hospitalAddresse;
    @ApiModelProperty(value = "测量体检编号")
    private String reportNo;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "用户性别")
    private String sex;
    @ApiModelProperty(value = "出生日期")
    private String birthday;
    @ApiModelProperty(value = "年龄")
    private String age;
    @ApiModelProperty(value = "体检时间")
    private String createTime;
    @ApiModelProperty(value = "体检方式（1.刷卡，2.微信，3.身份证号）")
    private  String healthType;
    @ApiModelProperty(value = "手机号")
    private String phone;
    @ApiModelProperty(value = "身份证号")
    private String idCode;
    @ApiModelProperty(value = "身高")
    private String height;
    @ApiModelProperty(value = "体重")
    private String weight;
    @ApiModelProperty(value = "bim值")
    private String hwBMi;
    @ApiModelProperty(value = "hwBmi状态")
    private String hwBmiState;
    @ApiModelProperty(value = "腰围（cm）")
    private String waistCircumference;
    @ApiModelProperty(value = "臂围（cm）")
    private String hipCircumference;
    @ApiModelProperty(value = "腰臂BMI")
    private String ytBmi;
    @ApiModelProperty(value = "ytBmi状态")
    private String ytBmiState;
    @ApiModelProperty(value = "左眼视力")
    private String leftEyesight;
    @ApiModelProperty(value = "左眼视力状态(1=偏高 2=偏低 3=正常)")
    private String leftEyesightState;
    @ApiModelProperty(value = "右眼视力")
    private String rightEyesight;
    @ApiModelProperty(value = "右眼视力状态(1=偏高 2=偏低 3=正常)")
    private String rightEyesightState;
    @ApiModelProperty(value = "收缩压")
    private String heightPressure;
    @ApiModelProperty(value = "收缩压状态(1=偏高 2=偏低 3=正常)")
    private String heightPressureState;
    @ApiModelProperty(value = "舒张压")
    private String lowPressure;
    @ApiModelProperty(value = "舒张压状态(1=偏高 2=偏低 3=正常)")
    private String lowPressureState;
    @ApiModelProperty(value = "脉搏")
    private String pulse;
    @ApiModelProperty(value = "脉搏状态(1=偏高 2=偏低 3=正常)")
    private String pulseState;
    @ApiModelProperty(value = "血氧")
    private String oxygenStaturation;
    @ApiModelProperty(value = "血氧状态")
    private String oxygenStaturationState;
    @ApiModelProperty(value = "血糖")
    private String bloodSugar;
    @ApiModelProperty(value = "血糖状态")
    private String bloodSugarState;
    @ApiModelProperty(value = "血糖类型")
    private String bloodSugarType;
    @ApiModelProperty(value = "心率状态")
    private String ecgRateState;
    @ApiModelProperty(value = "心率")
    private String ecgRate;
    @ApiModelProperty(value = "体温")
    private String templature;
    @ApiModelProperty(value = "体温状态")
    private String templatureState;
    @ApiModelProperty(value = "体脂肪率")
    private String fatRate;
    @ApiModelProperty(value = "体脂肪率状态")
    private String fatRateState;
    @ApiModelProperty(value = "体脂肪量")
    private String fat;
    @ApiModelProperty(value = "体水分率")
    private String waterRate;
    @ApiModelProperty(value = "体水分率状态")
    private String waterRateState;
    @ApiModelProperty(value = "体水分量")
    private String water;
    @ApiModelProperty(value = "基础代谢")
    private String basalMetabolism;
    @ApiModelProperty(value = "基础代谢状态")
    private String basalMetabolismState;
    @ApiModelProperty(value = "尿酸")
    private String uricAcid;
    @ApiModelProperty(value = "尿酸状态")
    private String uricAcidState;
    @ApiModelProperty(value = "总胆固醇")
    private String totalCholesterol;
    @ApiModelProperty(value = "总胆固醇状态")
    private String totalCholesterolState;
    @ApiModelProperty(value = "甘油三脂")
    private String triglycerides;
    @ApiModelProperty(value = "甘油三脂状态")
    private String triglyceridesState;
    @ApiModelProperty(value = "高密度蛋白")
    private String heightLipoprotein;
    @ApiModelProperty(value = "高密度蛋白状态")
    private String heightLipoproteinState;
    @ApiModelProperty(value = "低密度蛋白")
    private String lowLipoprotein;
    @ApiModelProperty(value = "低密度蛋白状态")
    private String lowLipoproteinState;
    @ApiModelProperty(value = "体型评估")
    private String build;
    @ApiModelProperty(value = "心电图")
    private String ecgs;
    @ApiModelProperty(value = "心电图结论")
    private String ecgRateResult;
    @ApiModelProperty(value = "中医体质分析结果")
    private String physicalResult;
    @ApiModelProperty(value = "TC/HDL")
    private String tcHdl;
    @ApiModelProperty(value = "胆固醇")
    private String cholesterol;
    @ApiModelProperty(value = "胆固醇状态")
    private String cholesterolState;
    @ApiModelProperty(value = "脉率")
    private String pulseRate;
    @ApiModelProperty(value = "脉率状态")
    private String pulseRateState;
}
