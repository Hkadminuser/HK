package njhk.wisdom.web.service.impl.children;

import njhk.wisdom.web.bean.entity.customer.StayAtHomeChildren;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.children.StayAtHomeChildrenDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class StayAtHomeChildrenService extends CrudService<StayAtHomeChildrenDao, StayAtHomeChildren> {
}
