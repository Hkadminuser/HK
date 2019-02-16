package njhk.wisdom.web.service.impl.relation;

import njhk.wisdom.web.bean.entity.relevance.WxServicepgdOtherserveperson;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.relation.WxServicepgdOtherservepersonDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class WxServicepgdOtherservepersonService extends CrudService<WxServicepgdOtherservepersonDao,WxServicepgdOtherserveperson> {
}
