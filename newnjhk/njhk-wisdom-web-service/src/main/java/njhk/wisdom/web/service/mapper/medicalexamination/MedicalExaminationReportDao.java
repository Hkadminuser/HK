package njhk.wisdom.web.service.mapper.medicalexamination;

import njhk.wisdom.web.bean.entity.customer.MedicalExaminationReport;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MedicalExaminationReportDao extends CrudDao<MedicalExaminationReport> {
}
