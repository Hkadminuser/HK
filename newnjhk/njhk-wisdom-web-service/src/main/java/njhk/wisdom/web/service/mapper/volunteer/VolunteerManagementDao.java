package njhk.wisdom.web.service.mapper.volunteer;

import njhk.wisdom.web.bean.entity.server.VolunteerManagement;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VolunteerManagementDao extends CrudDao<VolunteerManagement> {
}
