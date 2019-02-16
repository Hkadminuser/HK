package njhk.wisdom.web.service.impl.resources;

import njhk.wisdom.web.bean.entity.resources.SyResource;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.resources.SyResourceDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class SyResourceService extends CrudService<SyResourceDao, SyResource> {
    @Resource
    private SyResourceDao syResourceDao;
    public List<SyResource> getResource() {
        return  syResourceDao.getResource();
    }
}
