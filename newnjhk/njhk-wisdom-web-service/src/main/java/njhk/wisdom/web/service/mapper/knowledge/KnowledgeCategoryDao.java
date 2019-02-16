package njhk.wisdom.web.service.mapper.knowledge;

import njhk.wisdom.web.bean.entity.other.KnowledgeCategory;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface KnowledgeCategoryDao extends CrudDao<KnowledgeCategory> {
}
