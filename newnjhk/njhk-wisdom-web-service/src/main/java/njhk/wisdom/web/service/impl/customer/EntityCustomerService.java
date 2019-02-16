package njhk.wisdom.web.service.impl.customer;

import njhk.wisdom.web.bean.entity.pojo.customer.EntityCustomer;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.customer.EntityCustomerDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class EntityCustomerService extends CrudService<EntityCustomerDao, EntityCustomer> {
}
