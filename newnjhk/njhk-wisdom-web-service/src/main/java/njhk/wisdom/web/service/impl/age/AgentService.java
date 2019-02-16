package njhk.wisdom.web.service.impl.age;

import njhk.wisdom.web.bean.entity.pojo.age.Agent;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.age.AgentDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AgentService extends CrudService<AgentDao, Agent> {
}
