package njhk.wisdom.web.service.impl.cusbackcall;

import njhk.wisdom.web.bean.entity.pojo.cusbackcall.CusbackCall;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.cusbackcall.CusbackCallDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CusbackCallService extends CrudService<CusbackCallDao, CusbackCall> {
}
