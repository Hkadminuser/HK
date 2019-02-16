package njhk.wisdom.web.service.impl.goods;

import njhk.wisdom.web.bean.entity.pojo.goods.Goodspgd;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.goods.GoodspgdDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GoodspgdService extends CrudService<GoodspgdDao, Goodspgd> {
}
