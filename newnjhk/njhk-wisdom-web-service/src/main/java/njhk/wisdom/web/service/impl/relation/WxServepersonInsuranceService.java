package njhk.wisdom.web.service.impl.relation;

import njhk.wisdom.web.bean.entity.relevance.WxServepersonInsurance;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.relation.WxServepersonInsuranceDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class WxServepersonInsuranceService extends CrudService<WxServepersonInsuranceDao, WxServepersonInsurance> {
}
