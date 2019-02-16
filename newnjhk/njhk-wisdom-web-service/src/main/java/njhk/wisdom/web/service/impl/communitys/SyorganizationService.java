package njhk.wisdom.web.service.impl.communitys;

import njhk.wisdom.web.bean.entity.resources.Syorganization;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.communitys.SyorganizationDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SyorganizationService extends CrudService<SyorganizationDao, Syorganization> {
}
