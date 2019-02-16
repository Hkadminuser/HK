package njhk.wisdom.web.service.mapper.advice;

import njhk.wisdom.web.bean.entity.pojo.advice.AdviceType;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdviceTypeDao extends CrudDao<AdviceType> {
}
