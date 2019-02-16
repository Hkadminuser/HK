package njhk.wisdom.web.service.impl.insurance;

import njhk.wisdom.web.bean.entity.other.Insurance;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.insurance.InsuranceDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class InsuranceService extends CrudService<InsuranceDao, Insurance> {
}
