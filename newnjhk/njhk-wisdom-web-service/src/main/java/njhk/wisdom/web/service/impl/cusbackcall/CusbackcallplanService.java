package njhk.wisdom.web.service.impl.cusbackcall;

import njhk.wisdom.web.bean.entity.pojo.cusbackcall.Cusbackcallplan;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.cusbackcall.CusbackcallplanDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CusbackcallplanService extends CrudService<CusbackcallplanDao, Cusbackcallplan> {
}
