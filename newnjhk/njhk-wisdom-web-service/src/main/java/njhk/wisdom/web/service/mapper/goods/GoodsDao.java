package njhk.wisdom.web.service.mapper.goods;

import njhk.wisdom.web.bean.entity.pojo.goods.Goods;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsDao extends CrudDao<Goods> {
}
