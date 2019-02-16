package njhk.wisdom.web.service.mapper.insurance;

import njhk.wisdom.web.bean.entity.other.Insurance;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsuranceDao extends CrudDao<Insurance> {
}
