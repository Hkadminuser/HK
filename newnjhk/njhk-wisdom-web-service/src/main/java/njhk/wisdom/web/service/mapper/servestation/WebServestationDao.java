package njhk.wisdom.web.service.mapper.servestation;

import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WebServestationDao extends CrudDao<ServeStation> {
    String selevtZone(String id);

    String selevtStreet(String id);

    String selevtShequ(String id);

    void StopServestation(String id);

    List<ServeStation> findServestationByStatname(ServeStation serveStation);
}
