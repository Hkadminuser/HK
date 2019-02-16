package njhk.wisdom.web.service.impl.sang;

//import njhk.wisdom.web.api.utils.HrUtils;
import njhk.wisdom.web.bean.entity.sang.Menu;
import njhk.wisdom.web.service.mapper.sang.MenuDao;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
@Service
@Transactional
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {
    @Resource
    MenuDao menuMapper;

//    @Cacheable(key = "#root.methodName")
    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }

//    public List<Menu> getMenusByHrId() {
//        return menuMapper.getMenusByHrId(id);
//    }

    public List<Menu> menuTree() {
        return menuMapper.menuTree();
    }

    public List<Long> getMenusByRid(Long rid) {
        return menuMapper.getMenusByRid(rid);
    }
}
