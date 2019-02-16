package njhk.wisdom.web.service.impl.unknown;


import njhk.wisdom.web.bean.vo.CodeReference;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.unknown.CodeReferenceDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CodeReferenceService extends CrudService<CodeReferenceDao, CodeReference> {
}
