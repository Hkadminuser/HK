package njhk.wisdom.web.service.impl.giftcert;

import njhk.wisdom.web.bean.entity.pojo.giftcert.GiftcertGoods;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.giftcert.Giftcert_GoodsDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class Giftcert_GoodsService extends CrudService<Giftcert_GoodsDao, GiftcertGoods> {
}
