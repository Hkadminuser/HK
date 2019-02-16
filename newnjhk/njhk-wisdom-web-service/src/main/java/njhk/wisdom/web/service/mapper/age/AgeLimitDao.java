package njhk.wisdom.web.service.mapper.age;

import njhk.wisdom.web.bean.entity.pojo.age.AgeLimit;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AgeLimitDao extends CrudDao<AgeLimit> {
}
