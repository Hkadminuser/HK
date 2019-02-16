package njhk.wisdom.web.service.impl.customer;

import njhk.wisdom.web.bean.vo.CustomerType;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.customer.CustomerTypeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CustomerTypeService extends CrudService<CustomerTypeDao, CustomerType> {
}
