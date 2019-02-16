package njhk.wisdom.web.service.impl.account;

import njhk.wisdom.web.bean.entity.resources.Syuser;
import njhk.wisdom.web.bean.entity.sang.SyuserUtils;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.account.SyuserDao;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class SyuserService extends CrudService<SyuserDao, Syuser> implements UserDetailsService {
    @Resource
    private SyuserDao syuserDao;
    public Syuser login(Syuser syuser) {
       return syuserDao.login(syuser);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Syuser syuser = syuserDao.loadUserByUsername(s);
        System.out.println(syuser+"-----------------------------");
        if (syuser == null) {
            throw new UsernameNotFoundException("用户名不对");
        }
        return syuser;
    }

    public int SyuserReg(String username, String password) {
        //如果用户名存在，返回错误
        if (syuserDao.loadUserByUsername(username) != null) {
            return -1;
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode(password);
        return syuserDao.SyuserReg(username, encode);
    }

    public List<Syuser> getSyusersByKeywords(String keywords) {
        return syuserDao.getSyusersByKeywords(keywords);
    }

    public int updateSyuser(Syuser syuser) {
        return syuserDao.updateSyuser(syuser);
    }

    public int updateSyuserRoles(String id, Long[] rids) {
        int i = syuserDao.deleteRoleBySyuserId(id);
        return syuserDao.addRolesForSyuser(id, rids);
    }

    public Syuser getSyuserById(String id) {
        return syuserDao.getSyuserById(id);
    }

    public int deleteSyuser(String id) {
        return syuserDao.deleteSyuser(id);
    }

    public List<Syuser> getAllHrExceptAdmin() {
        return syuserDao.getAllSyuser(SyuserUtils.getCurrentSyuser().getId());
    }
    public List<Syuser> getAllSyuser() {
        return syuserDao.getAllSyuser(null);
    }
}
