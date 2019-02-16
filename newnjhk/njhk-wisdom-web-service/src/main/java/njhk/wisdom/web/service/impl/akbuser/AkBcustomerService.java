package njhk.wisdom.web.service.impl.akbuser;

import njhk.wisdom.web.bean.entity.pojo.akbuser.AkBcustomer;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.akbuser.AkBcustomerDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AkBcustomerService extends CrudService<AkBcustomerDao, AkBcustomer> {
}
