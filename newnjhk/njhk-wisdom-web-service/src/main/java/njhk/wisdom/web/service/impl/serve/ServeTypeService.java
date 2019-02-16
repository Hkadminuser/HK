package njhk.wisdom.web.service.impl.serve;

import njhk.wisdom.web.bean.entity.server.ServeType;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.serve.ServeStationDao;
import njhk.wisdom.web.service.mapper.serve.ServeTypeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ServeTypeService extends CrudService<ServeTypeDao, ServeType> {
     @Resource
    ServeTypeDao serveTypeDao;
    public List<ServeType> ByserveStationId(String serveStationId) {
        return  serveTypeDao.ByserveStationId(serveStationId);
    }
}
