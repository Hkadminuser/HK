package njhk.wisdom.web.bean.entity.sang;

import njhk.wisdom.web.bean.entity.resources.Syuser;
import org.springframework.security.core.context.SecurityContextHolder;

public class SyuserUtils {
    public static Syuser getCurrentSyuser() {
        return (Syuser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
