package njhk.wisdom.web.service.impl.dict;

import njhk.wisdom.web.bean.entity.pojo.dict.Dict;
import njhk.wisdom.web.service.base.CrudService;

import njhk.wisdom.web.service.mapper.dict.DictDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DictService extends CrudService<DictDao, Dict> {
}
