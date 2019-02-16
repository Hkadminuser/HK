package njhk.wisdom.web.service.impl.resources;

import njhk.wisdom.web.bean.entity.resources.SyResourceType;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.resources.SyResourceTypeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SyResourceTypeService extends CrudService<SyResourceTypeDao, SyResourceType> {
}
