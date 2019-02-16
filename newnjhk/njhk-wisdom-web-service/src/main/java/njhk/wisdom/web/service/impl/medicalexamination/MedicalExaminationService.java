package njhk.wisdom.web.service.impl.medicalexamination;

import njhk.wisdom.web.bean.entity.customer.MedicalExamination;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.medicalexamination.MedicalExaminationDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MedicalExaminationService extends CrudService<MedicalExaminationDao, MedicalExamination> {
}
