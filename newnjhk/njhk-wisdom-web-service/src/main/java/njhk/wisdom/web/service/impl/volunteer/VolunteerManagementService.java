package njhk.wisdom.web.service.impl.volunteer;

import njhk.wisdom.web.bean.entity.server.VolunteerManagement;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.volunteer.VolunteerManagementDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class VolunteerManagementService extends CrudService<VolunteerManagementDao, VolunteerManagement> {
}
