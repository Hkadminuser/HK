package njhk.wisdom.web.service.impl.point;

import njhk.wisdom.web.bean.entity.server.Point;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.point.PointDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PointService extends CrudService<PointDao, Point> {
}
