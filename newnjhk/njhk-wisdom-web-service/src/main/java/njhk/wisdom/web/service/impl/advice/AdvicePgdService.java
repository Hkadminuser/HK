package njhk.wisdom.web.service.impl.advice;

import njhk.wisdom.web.bean.entity.pojo.advice.AdvicePgd;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.advice.AdvicePgdDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AdvicePgdService extends CrudService<AdvicePgdDao, AdvicePgd> {
}
