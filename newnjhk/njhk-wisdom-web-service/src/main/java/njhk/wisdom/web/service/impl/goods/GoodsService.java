package njhk.wisdom.web.service.impl.goods;

import njhk.wisdom.web.bean.entity.pojo.goods.Goods;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.goods.GoodsDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GoodsService extends CrudService<GoodsDao, Goods> {
}
