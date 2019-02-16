package njhk.wisdom.web.service.mapper.dict;

import njhk.wisdom.web.bean.entity.pojo.dict.Dict;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictDao extends CrudDao<Dict> {
}
