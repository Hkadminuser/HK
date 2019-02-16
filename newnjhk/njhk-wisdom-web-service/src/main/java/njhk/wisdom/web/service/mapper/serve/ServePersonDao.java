package njhk.wisdom.web.service.mapper.serve;

import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.entity.relevance.ServetypeServeperson;
import njhk.wisdom.web.bean.entity.relevance.WxServicepgdServeperson;
import njhk.wisdom.web.bean.entity.server.ServePerson;
import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.bean.entity.server.ServicePgd;
import njhk.wisdom.web.bean.vo.ServePersonVo;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServePersonDao extends CrudDao<ServePerson> {

    void stopServeperson(ServePerson servePerson);

    void saveServetypeServeperson(List<ServetypeServeperson> list);

    void deleteServetypeServeperson(String serveperson_id);

    List<ServeStation> findServePersonByServestationId(ServeStation serveStation);

    void Distribute(ServePerson servePerson);
}
