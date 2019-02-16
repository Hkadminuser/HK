package njhk.wisdom.web.service.impl.knowledge;

import njhk.wisdom.web.bean.entity.other.KnowledgeCategory;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.knowledge.KnowledgeCategoryDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class KnowledgeCategoryService extends CrudService<KnowledgeCategoryDao, KnowledgeCategory> {
}
