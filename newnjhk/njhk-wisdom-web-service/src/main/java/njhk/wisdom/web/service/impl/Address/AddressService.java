package njhk.wisdom.web.service.impl.Address;

import njhk.wisdom.web.bean.entity.address.Address;
import njhk.wisdom.web.bean.vo.AddressAo;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.Address.AddressDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class AddressService extends CrudService<AddressDao, Address> {
     @Resource
     private AddressDao addressDao;
    public List<AddressAo> findAddressById(Address add) {return addressDao.findAddressById(add);}
}
