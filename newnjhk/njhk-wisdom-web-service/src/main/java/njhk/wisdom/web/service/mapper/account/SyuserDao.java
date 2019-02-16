package njhk.wisdom.web.service.mapper.account;

import njhk.wisdom.web.bean.entity.resources.SyRole;
import njhk.wisdom.web.bean.entity.resources.Syuser;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SyuserDao extends CrudDao<Syuser> {


    Syuser login(Syuser syuser);

    Syuser loadUserByUsername(String s);

    List<SyRole> getRolesByHrId(String id);

    int SyuserReg(String username, String encode);

    List<Syuser> getSyusersByKeywords(String keywords);

    int updateSyuser(Syuser syuser);

    int deleteRoleBySyuserId(String id);

    int addRolesForSyuser(String id, Long[] rids);

    Syuser getSyuserById(String id);

    int deleteSyuser(String id);

    List<Syuser> getAllSyuser(String id);
}
