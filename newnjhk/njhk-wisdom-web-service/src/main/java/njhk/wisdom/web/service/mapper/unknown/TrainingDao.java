package njhk.wisdom.web.service.mapper.unknown;

import njhk.wisdom.web.bean.entity.other.Training;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TrainingDao extends CrudDao<Training> {
}
