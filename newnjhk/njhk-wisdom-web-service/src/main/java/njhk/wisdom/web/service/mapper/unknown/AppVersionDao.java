package njhk.wisdom.web.service.mapper.unknown;

import njhk.wisdom.web.bean.entity.pojo.unknown.AppVersion;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppVersionDao extends CrudDao<AppVersion> {
}