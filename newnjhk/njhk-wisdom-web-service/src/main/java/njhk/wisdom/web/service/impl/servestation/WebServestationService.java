package njhk.wisdom.web.service.impl.servestation;

import njhk.wisdom.web.bean.entity.server.ServeStation;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.servestation.WebServestationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = false)
public class WebServestationService extends CrudService<WebServestationDao, ServeStation> {
    @Resource
    private  WebServestationDao webServestationDao;

    public String selevtZone(String id) {
        return webServestationDao.selevtZone(id);
    }

    public String selevtStreet(String id) {
        return webServestationDao.selevtStreet(id);
    }

    public String selevtShequ(String id) {
        return webServestationDao.selevtShequ(id);
    }

    public void StopServestation(String id) {webServestationDao.StopServestation(id);}

    public List<ServeStation> findServestationByStatname(ServeStation serveStation) {return webServestationDao.findServestationByStatname(serveStation);}
}
