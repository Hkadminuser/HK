package njhk.wisdom.web.service.impl.customer;

import njhk.wisdom.web.bean.entity.Excel;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.customer.ExcelDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ExcelService extends CrudService<ExcelDao,Excel> {

}
