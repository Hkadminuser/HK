package njhk.wisdom.web.service.impl.customer;

import njhk.wisdom.web.bean.entity.customer.Customer;
import njhk.wisdom.web.bean.entity.customer.CustomerStates;
import njhk.wisdom.web.bean.entity.customer.CustomerTypes;
import njhk.wisdom.web.bean.vo.CustomerVo;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.customer.WebCustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = false)
public class WebCustomerService extends CrudService<WebCustomerDao, Customer> {
    @Resource
    private WebCustomerDao webCustomerDao;

    public void updateZhuxiao(CustomerVo c) {
        webCustomerDao.updateZhuxiao(c);
    }

    public void updateQianyue(CustomerVo c) {webCustomerDao.updateQianyue(c);
    }

    public void batchDelete(CustomerVo c) {
        webCustomerDao.batchDelete(c);
    }

    public void batchUpdateZhuxiao(CustomerVo c) {
        webCustomerDao.batchUpdateZhuxiao(c);
    }

    public void batchUpdateQianyue(CustomerVo c) {
        webCustomerDao.batchUpdateQianyue(c);
    }

    public void batchUpdateShenhe(CustomerVo customer) {
        webCustomerDao.batchUpdateShenhe(customer);
    }

    public List<CustomerTypes> findCustomerType() {
        return webCustomerDao.findCustomerType();
    }

    public List<CustomerStates> findCustomerStates() {
        return webCustomerDao.findCustomerStates();
    }
}
