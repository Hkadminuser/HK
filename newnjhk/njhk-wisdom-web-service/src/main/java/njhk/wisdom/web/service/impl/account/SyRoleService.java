package njhk.wisdom.web.service.impl.account;

import njhk.wisdom.web.bean.entity.resources.SyRole;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.account.SyRoleDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SyRoleService extends CrudService<SyRoleDao, SyRole> {
}
