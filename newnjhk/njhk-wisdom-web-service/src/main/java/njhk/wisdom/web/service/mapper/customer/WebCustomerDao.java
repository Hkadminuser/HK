package njhk.wisdom.web.service.mapper.customer;

import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.entity.customer.CustomerStates;
import njhk.wisdom.web.bean.entity.customer.CustomerTypes;
import njhk.wisdom.web.bean.vo.CustomerVo;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WebCustomerDao extends CrudDao<Customer> {
    void updateZhuxiao(CustomerVo c);

    void updateQianyue(CustomerVo c);

    void batchDelete(CustomerVo c);

    void batchUpdateZhuxiao(CustomerVo c);

    void batchUpdateQianyue(CustomerVo c);

    void batchUpdateShenhe(CustomerVo customer);

    List<CustomerTypes> findCustomerType();

    List<CustomerStates> findCustomerStates();
}
