package njhk.wisdom.web.service.impl.phone;

import njhk.wisdom.web.bean.vo.PhoneModel;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.phone.PhoneModelDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PhoneModelService extends CrudService<PhoneModelDao, PhoneModel> {
}
