package njhk.wisdom.web.service.impl.age;

import njhk.wisdom.web.bean.entity.pojo.age.AgeLimit;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.age.AgeLimitDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AgeLimitService extends CrudService<AgeLimitDao, AgeLimit> {
}
