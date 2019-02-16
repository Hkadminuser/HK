package njhk.wisdom.web.service.impl.communitys;

import njhk.wisdom.web.bean.entity.pojo.communitys.Communitys;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.communitys.CommunitysDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CommunitysService extends CrudService<CommunitysDao, Communitys> {
}
