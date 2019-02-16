package njhk.wisdom.web.service.impl.pension;

import njhk.wisdom.web.bean.entity.customer.LiveHome;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.pension.LiveHomeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class LiveHomeService  extends CrudService<LiveHomeDao, LiveHome> {
}
