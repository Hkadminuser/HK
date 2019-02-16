package njhk.wisdom.web.service.impl.unknown;

import njhk.wisdom.web.bean.entity.pojo.unknown.AttachInfo;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.unknown.AttachInfoDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AttachInfoService extends CrudService<AttachInfoDao, AttachInfo> {
}
