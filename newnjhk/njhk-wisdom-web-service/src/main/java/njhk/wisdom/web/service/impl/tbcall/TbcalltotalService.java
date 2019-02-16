package njhk.wisdom.web.service.impl.tbcall;

import njhk.wisdom.web.bean.entity.pojo.unknown.Tbcalltotal;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.tbcall.TbcalltotalDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TbcalltotalService extends CrudService<TbcalltotalDao, Tbcalltotal> {
}
