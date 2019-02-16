package njhk.wisdom.web.service.impl.serve;

import njhk.wisdom.web.bean.entity.server.ServeBiz;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.serve.ServeBizDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ServeBizService extends CrudService<ServeBizDao, ServeBiz> {
}
