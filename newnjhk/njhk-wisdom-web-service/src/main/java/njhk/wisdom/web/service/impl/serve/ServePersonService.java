package njhk.wisdom.web.service.impl.serve;


import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.entity.relevance.ServetypeServeperson;
import njhk.wisdom.web.bean.entity.relevance.WxServicepgdServeperson;
import njhk.wisdom.web.bean.entity.server.ServePerson;
import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.bean.entity.server.ServicePgd;
import njhk.wisdom.web.bean.vo.ServePersonVo;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.serve.ServePersonDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = false)
public class ServePersonService extends CrudService<ServePersonDao, ServePerson> {
    @Resource
    private ServePersonDao servePersonDao;

    public void stopServeperson(ServePerson servePerson) {
        servePersonDao.stopServeperson(servePerson);
    }

    public void saveServetypeServeperson(List<ServetypeServeperson> list) {
        servePersonDao.saveServetypeServeperson(list);
    }

    public void deleteServetypeServeperson(String serveperson_id) {
        servePersonDao.deleteServetypeServeperson(serveperson_id);
    }

    public List<ServeStation> findServePersonByServestationId(ServeStation serveStation) {
        return  servePersonDao.findServePersonByServestationId(serveStation);
    }

    public void Distribute(ServePerson servePerson) {
                 servePersonDao.Distribute(servePerson);
    }

    public void insert(ServePerson servePerson) {servePersonDao.insert(servePerson);}
}
