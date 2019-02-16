package njhk.wisdom.web.bean.entity.customer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@ApiModel(description = "账号信息")
@Getter
@Setter
@ToString
public class StayAtHomeChildren extends DataEntity<StayAtHomeChildren> {
    @ApiModelProperty(value = "留守儿童id")
    private String id;
    @ApiModelProperty(value = "身份证号")
    private String idCard;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "年龄")
    private String age;
    @ApiModelProperty(value = "民族")
    private String nation;
    @ApiModelProperty(value = "生日")
    private String birthday;
    @ApiModelProperty(value = "户籍所在地")
    private String domicile;
    @ApiModelProperty(value = "现居地址")
    private String newAddress;
    @ApiModelProperty(value = "父亲姓名")
    private String fatherName;
    @ApiModelProperty(value = "母亲姓名")
    private String motherName;
    @ApiModelProperty(value = "父亲电话")
    private String fatherPhone;
    @ApiModelProperty(value = "母亲电话")
    private String motherPhone;
    @ApiModelProperty(value = "父亲工作地点")
    private String fatherWorkAddress;
    @ApiModelProperty(value = "母亲工作地点")
    private String motherWorkAddress;
    @ApiModelProperty(value = "上学情况1.未上学2.幼儿园3.小学4.初中5.高中6.高中以上")
    private String school;
    @ApiModelProperty(value = "寄宿情况1.寄宿2.在家居住")
    private String boarding;
    @ApiModelProperty(value = "健康情况1.健康2.亚健康3.患病")
    private String healthy;
    @ApiModelProperty(value = "实际监护情况1.爷爷奶奶2.外公外婆3.无人监护4.父亲或母亲一方监护")
    private String custody;
    @ApiModelProperty(value = "村委会联系人")
    private String villAgeCommitteeName;
    @ApiModelProperty(value = "村委会联系电话")
    private String villAgeCommitteePhone;
}
