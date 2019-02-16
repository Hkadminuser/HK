package njhk.wisdom.web.service.impl.refund;

import njhk.wisdom.web.bean.entity.server.Refund;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.refund.RefundDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RefundService extends CrudService<RefundDao, Refund> {
}
