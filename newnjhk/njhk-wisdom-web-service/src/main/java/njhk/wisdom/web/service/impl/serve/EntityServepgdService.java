package njhk.wisdom.web.service.impl.serve;

import njhk.wisdom.web.bean.entity.pojo.serve.EntityServepgd;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.serve.EntityServepgdDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class EntityServepgdService extends CrudService<EntityServepgdDao, EntityServepgd> {
}
