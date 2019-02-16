package njhk.wisdom.web.service.impl.serve;

import njhk.wisdom.web.bean.entity.other.ServerCity;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.serve.ServerCityDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ServerCityService extends CrudService<ServerCityDao, ServerCity> {
}
