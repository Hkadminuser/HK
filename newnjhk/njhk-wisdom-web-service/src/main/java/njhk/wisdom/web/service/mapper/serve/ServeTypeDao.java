package njhk.wisdom.web.service.mapper.serve;

import njhk.wisdom.web.bean.entity.server.ServeType;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServeTypeDao extends CrudDao<ServeType> {
    List<ServeType> ByserveStationId(String serveStationId);
}
