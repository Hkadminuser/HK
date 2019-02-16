package njhk.wisdom.web.service.mapper.customer;

import njhk.wisdom.web.bean.entity.customer.Customer;
import org.apache.ibatis.annotations.Mapper;
import njhk.wisdom.web.service.base.CrudDao;
@Mapper
public interface CustomerDao extends CrudDao<Customer> {

}
