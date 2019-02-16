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
public class MedicalExamination extends DataEntity<MedicalExamination> {
    @ApiModelProperty(value = "主键id")
    private String id;
    @ApiModelProperty(value = "高密度蛋白")
    private String  HdlChol;
    @ApiModelProperty(value = "甘油三酯")
    private String  Trig;
    @ApiModelProperty(value = "血脂比值")
    private String  TcHdl;
    @ApiModelProperty(value = "低密度蛋白")
    private String  CalcLdl;
    @ApiModelProperty(value = "结论：-1、低，0、正常，1、高")
    private String  xuezhiResult;
    @ApiModelProperty(value = "心脏功能")
    private String  HeartFunction1;
    @ApiModelProperty(value = "心血管状况")
    private String  VascularCondition1;
    @ApiModelProperty(value = "心脏功能-简化数据")
    private String  HeartFunction2;
    @ApiModelProperty(value = "心血管状况-简化数据")
    private String  VascularCondition2;
    @ApiModelProperty(value = "诊断结果")
    private String  zhenduanResult;
    @ApiModelProperty(value = "SV 幅度")
    private String  SV;
    @ApiModelProperty(value = "CO")
    private String  CO;
    @ApiModelProperty(value = "HOV")
    private String  HOV;
    @ApiModelProperty(value = "CMBV")
    private String  CMBV;
    @ApiModelProperty(value = "TPR")
    private String  TPR;
    @ApiModelProperty(value = "PAWP")
    private String  PAWP;
    @ApiModelProperty(value = "N")
    private String  N;
    @ApiModelProperty(value = "T值，受试者的数值与年轻健康成人的骨密度平均值的标准差")
    private String  TSCORE;
    @ApiModelProperty(value = "Z值，受试者的数值与同年龄人群骨密度的平均值的标准差")
    private String  ZSCORE;
    @ApiModelProperty(value = "骨质指数，数值越大表示骨密度越高")
    private String  OI;
    @ApiModelProperty(value = "骨质指数，数值越大表示骨密度越高")
    private String  BQI;
    @ApiModelProperty(value = "超声声速")
    private String  SOS;
    @ApiModelProperty(value = "YOUNG_ADULT")
    private String  YOUNG_ADULT;
    @ApiModelProperty(value = "AGE_MATCHED")
    private String  AGE_MATCHED;
    @ApiModelProperty(value = "BUA")
    private String  BUA;
    @ApiModelProperty(value = "预期发生骨质疏松的年龄")
    private String  EOA;
    @ApiModelProperty(value = "相对骨折风险")
    private String  RRF;
    @ApiModelProperty(value = "骨骼的生理年龄")
    private String  PAB;
    @ApiModelProperty(value = "诊断结果:-2、骨强度不足，-1、骨质疏松，0、正常")
    private String  guResult;
    @ApiModelProperty(value = "血红蛋白值")
    private String  Hb;
    @ApiModelProperty(value = "红细胞比容")
    private String  Hct;
    @ApiModelProperty(value = "诊断结果：-1、血红蛋白偏低，0、正常，1血红蛋白偏高")
    private String  xhdanbaiResult;
    @ApiModelProperty(value = "酒精浓度值（单位 mg/100ml）")
    private String  Alcohol;
    @ApiModelProperty(value = "0:正常 1：饮酒 2：醉酒")
    private String  jiuResult;
    @ApiModelProperty(value = "错误信息")
    private String  errinfo;
    @ApiModelProperty(value = "单位 ml")
    private String  Lung;
    @ApiModelProperty(value = "用力肺活量")
    private double  FVC;
    @ApiModelProperty(value = "用力呼气1秒量")
    private double  FEV1;
    @ApiModelProperty(value = "呼气峰值流速")
    private double  PEF;
    @ApiModelProperty(value = "25% 肺活量时的用力呼气流速")
    private double  FEF25;
    @ApiModelProperty(value = "75% 肺活量时的用力呼气流速")
    private double  FEF75;
    @ApiModelProperty(value = "平均流速")
    private double FEF2575;
    @ApiModelProperty(value = "结果（暂无）")
    private String  feihuoResult;
    @ApiModelProperty(value = "平均脉压")
    private String  MAP;
    @ApiModelProperty(value = "脉冲压")
    private String  PP;
    @ApiModelProperty(value = "踝肱指数")
    private String  ABI;
    @ApiModelProperty(value = "心室颤动")
    private String  Afib;
    @ApiModelProperty(value = "尿胆原")
    private int  URO;
    @ApiModelProperty(value = "潜血")
    private int  BLD;
    @ApiModelProperty(value = "胆红素")
    private int  BIL;
    @ApiModelProperty(value = "酮体")
    private int  KET;
    @ApiModelProperty(value = "白细胞")
    private int  LEU;
    @ApiModelProperty(value = "葡萄糖")
    private int  GLU;
    @ApiModelProperty(value = "蛋白质")
    private int  PRO;
    @ApiModelProperty(value = "酸碱度")
    private int  PH;
    @ApiModelProperty(value = "亚硝酸盐")
    private int  NIT;
    @ApiModelProperty(value = "比重")
    private int  SG;
    @ApiModelProperty(value = "维生素")
    private int  VC;
    @ApiModelProperty(value = "微白蛋白")
    private int  MAL;
    @ApiModelProperty(value = "肌酐")
    private int  CR;
    @ApiModelProperty(value = "钙离子")
    private int  UCA;
    @ApiModelProperty(value = "结果")
    private int  liaoyeResult;
}
