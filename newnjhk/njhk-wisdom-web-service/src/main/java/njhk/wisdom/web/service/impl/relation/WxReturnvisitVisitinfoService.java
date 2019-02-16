package njhk.wisdom.web.service.impl.relation;

import njhk.wisdom.web.bean.entity.relevance.WxReturnvisitVisitinfo;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.relation.WxReturnvisitVisitinfoDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class WxReturnvisitVisitinfoService extends CrudService<WxReturnvisitVisitinfoDao, WxReturnvisitVisitinfo> {
}
