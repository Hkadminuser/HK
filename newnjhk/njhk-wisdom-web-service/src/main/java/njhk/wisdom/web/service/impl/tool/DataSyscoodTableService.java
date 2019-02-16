package njhk.wisdom.web.service.impl.tool;

import njhk.wisdom.web.bean.entity.pojo.tool.DataSyscoodTable;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.tool.DataSyscoodTableDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DataSyscoodTableService extends CrudService<DataSyscoodTableDao, DataSyscoodTable> {
}
