package njhk.wisdom.web.service.impl.relation;

import njhk.wisdom.web.bean.entity.pojo.relation.RptServepersonEstimatelevel;
import njhk.wisdom.web.service.base.CrudService;

import njhk.wisdom.web.service.mapper.relation.Rpt_Serveperson_EstimatelevelDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class Rpt_Serveperson_EstimatelevelService extends CrudService<Rpt_Serveperson_EstimatelevelDao, RptServepersonEstimatelevel> {

}
