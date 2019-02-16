package njhk.wisdom.web.service.impl.notice;

import njhk.wisdom.web.bean.entity.other.Notice;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.notice.NoticeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class NoticeService extends CrudService<NoticeDao, Notice> {
}
