package njhk.wisdom.web.service.impl.medicalexamination;

import njhk.wisdom.web.bean.entity.customer.MedicalExaminationReport;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.medicalexamination.MedicalExaminationReportDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MedicalExaminationReportService extends CrudService<MedicalExaminationReportDao, MedicalExaminationReport> {
}
