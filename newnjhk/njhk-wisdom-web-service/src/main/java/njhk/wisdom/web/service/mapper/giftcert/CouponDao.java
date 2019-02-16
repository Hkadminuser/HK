package njhk.wisdom.web.service.mapper.giftcert;

import njhk.wisdom.web.bean.entity.pojo.giftcert.Coupon;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponDao extends CrudDao<Coupon> {
}
