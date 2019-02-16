package njhk.wisdom.web.service.impl.government;

import njhk.wisdom.web.bean.entity.pojo.government.Governmentstaff;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.government.GovernmentstaffDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GovernmentstaffService extends CrudService<GovernmentstaffDao, Governmentstaff> {
}
