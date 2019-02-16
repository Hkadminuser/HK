package njhk.wisdom.web.service.mapper.knowledge;

import njhk.wisdom.web.bean.entity.other.Knowledge;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KnowledgeDao extends CrudDao<Knowledge> {
}
