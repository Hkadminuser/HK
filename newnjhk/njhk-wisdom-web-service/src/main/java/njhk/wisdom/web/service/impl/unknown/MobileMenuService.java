package njhk.wisdom.web.service.impl.unknown;

import njhk.wisdom.web.bean.vo.MobileMenu;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.unknown.MobileMenuDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MobileMenuService extends CrudService<MobileMenuDao, MobileMenu> {
}
