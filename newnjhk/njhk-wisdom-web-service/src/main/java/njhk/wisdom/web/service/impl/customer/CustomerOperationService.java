package njhk.wisdom.web.service.impl.customer;

import njhk.wisdom.web.bean.entity.pojo.customer.CustomerOperation;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.customer.CustomerOperationDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CustomerOperationService extends CrudService<CustomerOperationDao, CustomerOperation> {
}
