package njhk.wisdom.web.service.impl.sms;

import njhk.wisdom.web.bean.entity.pojo.sms.Sms;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.sms.SmsDao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SmsService extends CrudService<SmsDao, Sms> {
}
