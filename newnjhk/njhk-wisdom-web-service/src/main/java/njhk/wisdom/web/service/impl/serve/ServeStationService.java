package njhk.wisdom.web.service.impl.serve;

import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.serve.ServeStationDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ServeStationService extends CrudService<ServeStationDao, ServeStation> {
}
