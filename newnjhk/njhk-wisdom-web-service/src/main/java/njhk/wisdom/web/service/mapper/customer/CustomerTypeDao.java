package njhk.wisdom.web.service.mapper.customer;

import njhk.wisdom.web.bean.vo.CustomerType;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerTypeDao extends CrudDao<CustomerType> {
}
