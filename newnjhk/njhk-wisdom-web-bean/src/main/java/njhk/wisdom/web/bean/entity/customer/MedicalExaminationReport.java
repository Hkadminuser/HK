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
public class MedicalExaminationReport extends DataEntity<MedicalExaminationReport> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "测量编号")
    private String recordNo;//
    @ApiModelProperty(value = "测量时间")
    private String measureTime;//
    @ApiModelProperty(value = "登录方式1.身份证2.手机号")
    private String loginType;//
    @ApiModelProperty(value = "手机号")
    private String mobile;//
    @ApiModelProperty(value = "身份证号")
    private String IdCode;//
    @ApiModelProperty(value = "身高")
    private String height;//
    @ApiModelProperty(value = "体重")
    private String weight;//
    @ApiModelProperty(value = "bim值")
    private String BMI;//
    @ApiModelProperty(value = "理想体重")
    private String IdealWeight;//
    @ApiModelProperty(value = "身高体重结论 结论：-1、消瘦，0、正常，1、超重，2、肥胖")
    private String hwResult;//
    @ApiModelProperty(value = "体质占比")
    private String FatRate;//
    @ApiModelProperty(value = "体脂肪量")
    private String Fat;//
    @ApiModelProperty(value = "非脂肪量")
    private String ExceptFat;//
    @ApiModelProperty(value = "体水占比")
    private String WaterRate;//
    @ApiModelProperty(value = "水含量")
    private String Water;//
    @ApiModelProperty(value = "矿物质")
    private String Minerals;//
    @ApiModelProperty(value = "蛋白质含量")
    private String Protein;//
    @ApiModelProperty(value = "细胞内液")
    private String Fic;//
    @ApiModelProperty(value = "细胞外液")
    private String Foc;//
    @ApiModelProperty(value = "肌肉量")
    private String Muscle;//
    @ApiModelProperty(value = "脂肪调节")
    private String FatAdjust;//
    @ApiModelProperty(value = "体重调节")
    private String WeightAdjust;//
    @ApiModelProperty(value = "肌肉调节")
    private String MuscleAdjust;//
    @ApiModelProperty(value = "基础代谢")
    private String BasicMetabolism;//
    @ApiModelProperty(value = "内脏脂肪等级")
    private String  Viscera;//
    @ApiModelProperty(value = "骨骼量")
    private String  Bmc;//
    @ApiModelProperty(value = "肌肉率")
    private String  MuscleRate;//
    @ApiModelProperty(value = "躯干肌肉量")
    private String  QuganMuscle;//
    @ApiModelProperty(value = "躯干脂肪量")
    private String QuganFat;//
    @ApiModelProperty(value = "左腿肌肉量")
    private String  ZuotuiMuscle;//
    @ApiModelProperty(value = "左臂肌肉量")
    private String  ZuobiMuscle;//
    @ApiModelProperty(value = "右臂肌肉量")
    private String  YoubiMuscle;//
    @ApiModelProperty(value = "右腿肌肉量")
    private String  YoutuiMuscle;//
    @ApiModelProperty(value = "左臂脂肪量")
    private String  ZuobiFat;//
    @ApiModelProperty(value = "左腿脂肪量")
    private String  ZuotuiFat;//
    @ApiModelProperty(value = "右臂脂肪量")
    private String  YoubiFat;//
    @ApiModelProperty(value = "右腿脂肪量")
    private String  YoutuiFat;//
    @ApiModelProperty(value = "体质指数：1、偏低，2、标准,3、偏高，4、高")
    private String  Physique;//
    @ApiModelProperty(value = "体型：1、消瘦，2、标准，3、隐藏性肥胖，4、肌肉型肥胖/健壮，5、肥胖")
    private String  Shape;//
    @ApiModelProperty(value = "（收缩压）高压")
    private String  HighPressure;//
    @ApiModelProperty(value = "（舒张压）低压")
    private String  LowPressure;//
    @ApiModelProperty(value = "脉搏")
    private String  Pulse;//
    @ApiModelProperty(value = "结论：-1、低压，0、正常，1、正常高压 2、轻度高压 3、中度高压 4、重度高压")
    private String  xueyaResult;//
    @ApiModelProperty(value = "血氧值")
    private String  Oxygen;//
    @ApiModelProperty(value = "血氧列表值")
    private String  OxygenList;//
    @ApiModelProperty(value = "脉率值")
    private String  Bpm;//
    @ApiModelProperty(value = "脉率列表值")
    private String  BpmList;//
    @ApiModelProperty(value = "结论：-1、低血氧，0、正常血氧")
    private String  xueyangResult;//
    @ApiModelProperty(value = "开始时间")
    private String  StartTime;//
    @ApiModelProperty(value = "结束时间")
    private String  EndTime;//
    @ApiModelProperty(value = "总测量秒数")
    private String  SecondCount;//
    @ApiModelProperty(value = "心率值")
    private String  Hr;//
    @ApiModelProperty(value = "心电图数据")
    private String  EcgData;//
    @ApiModelProperty(value = "增益")
    private String  nert;//
    @ApiModelProperty(value = "结论：5025对照说明详见附1")
    private String  Analysis;//
    @ApiModelProperty(value = "P轴")
    private String  PAxis;//
    @ApiModelProperty(value = "QRS轴")
    private String  QRSAxis;//
    @ApiModelProperty(value = "T轴")
    private String  TAxis;//
    @ApiModelProperty(value = "PR 间期")
    private String  PR;//
    @ApiModelProperty(value = "QRS 时限")
    private String  QRS;//
    @ApiModelProperty(value = "QT 间期")
    private String  QT;//
    @ApiModelProperty(value = "QTc 间期")
    private String  QTc;//
    @ApiModelProperty(value = "RV5 幅度")
    private String  RV5;//
    @ApiModelProperty(value = "SV1 幅度")
    private String  SV1;//
    @ApiModelProperty(value = "心电波形图图片")
    private String  ecgImg;//
    @ApiModelProperty(value = "心电结论")
    private String  xindianResult;//
    @ApiModelProperty(value = "体温值")
    private String  Temperature;//
    @ApiModelProperty(value = "结论：-1、低温，0、正常，1、高温")
    private String  tiwenResult;//
    @ApiModelProperty(value = "腰围")
    private String  Waistline;//
    @ApiModelProperty(value = "臀围")
    private String  Hipline;//
    @ApiModelProperty(value = "腰臀比")
    private String  Whr;//
    @ApiModelProperty(value = "结论： 0:正常，1：上身肥胖,2:下身肥胖")
    private String  yaotunResult;//
    @ApiModelProperty(value = "血糖值")
    private String  BloodSugar;//
    @ApiModelProperty(value = "血糖类型：1、餐前血糖，2、餐后血糖，3、随机血糖")
    private String  BloodsugarType;//
    @ApiModelProperty(value = "结论：-1、低血糖，0、正常，1、偏高 2、高")
    private String  xuetangResult;//
    @ApiModelProperty(value = "尿酸值")
    private String  Ua;//
    @ApiModelProperty(value = "结论：-1、低，0、正常，1、高")
    private String  xueliaosuanResult;//
    @ApiModelProperty(value = "总胆固醇值")
    private String  Chol;//
    @ApiModelProperty(value = "结论：-1、低，0、正常，1、高  2、过高")
    private String  danguResult;//
    @ApiModelProperty(value = "总胆固醇")
    private String  TChol;//
    @ApiModelProperty(value = "体检报告附表id")
    private String medicalExamination;
}
