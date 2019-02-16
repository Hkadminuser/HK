package njhk.wisdom.web.service.impl.unknown;

import njhk.wisdom.web.bean.entity.pojo.unknown.Commonsms;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.unknown.CommonsmsDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CommonsmsService extends CrudService<CommonsmsDao, Commonsms> {
}
