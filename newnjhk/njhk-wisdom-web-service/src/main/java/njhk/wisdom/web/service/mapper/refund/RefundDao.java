package njhk.wisdom.web.service.mapper.refund;

import njhk.wisdom.web.bean.entity.server.Refund;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RefundDao extends CrudDao<Refund> {
}
