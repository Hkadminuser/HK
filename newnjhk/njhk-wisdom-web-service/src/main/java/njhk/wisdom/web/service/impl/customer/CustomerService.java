package njhk.wisdom.web.service.impl.customer;

import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.service.base.CrudService;

import njhk.wisdom.web.service.mapper.customer.CustomerDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CustomerService extends CrudService<CustomerDao, Customer> {

}
