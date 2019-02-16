package njhk.wisdom.web.service.impl.serve;

import njhk.wisdom.web.bean.entity.other.Servesche;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.serve.ServescheDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ServescheService extends CrudService<ServescheDao, Servesche> {
}
