package njhk.wisdom.web.service.mapper.unknown;

import njhk.wisdom.web.bean.entity.pojo.unknown.Config;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfigDao extends CrudDao<Config> {
}
