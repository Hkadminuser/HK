package njhk.wisdom.web.service.mapper.medicalexamination;

import njhk.wisdom.web.bean.entity.customer.MedicalExamination;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicalExaminationDao extends CrudDao<MedicalExamination> {
}
