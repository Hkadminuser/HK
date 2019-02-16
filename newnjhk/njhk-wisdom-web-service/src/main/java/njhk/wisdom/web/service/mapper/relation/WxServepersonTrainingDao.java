package njhk.wisdom.web.service.mapper.relation;

import njhk.wisdom.web.bean.entity.relevance.WxServepersonTraining;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface WxServepersonTrainingDao extends CrudDao<WxServepersonTraining> {
}
