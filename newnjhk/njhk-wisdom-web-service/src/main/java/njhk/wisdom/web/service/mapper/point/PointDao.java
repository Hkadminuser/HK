package njhk.wisdom.web.service.mapper.point;

import njhk.wisdom.web.bean.entity.server.Point;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PointDao extends CrudDao<Point> {
}
