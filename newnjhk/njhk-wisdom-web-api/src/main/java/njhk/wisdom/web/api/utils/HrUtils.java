package njhk.wisdom.web.api.utils;

import njhk.wisdom.web.bean.entity.resources.Syuser;
import njhk.wisdom.web.bean.entity.sang.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by sang on 2017/12/30.
 */
public class HrUtils {
    public static Syuser getCurrentHr() {
        return (Syuser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
