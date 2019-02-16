package njhk.wisdom.web.service.impl.knowledge;

import njhk.wisdom.web.bean.entity.other.Knowledge;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.knowledge.KnowledgeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class KnowledgeService extends CrudService<KnowledgeDao, Knowledge> {
}
