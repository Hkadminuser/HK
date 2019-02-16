package njhk.wisdom.web.service.impl.goods;

import njhk.wisdom.web.bean.entity.pojo.goods.GoodsCategory;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.goods.GoodsCategoryDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class GoodsCategoryService extends CrudService<GoodsCategoryDao, GoodsCategory> {
}
