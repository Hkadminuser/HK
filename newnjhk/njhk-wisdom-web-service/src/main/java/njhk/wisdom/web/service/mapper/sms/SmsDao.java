package njhk.wisdom.web.service.mapper.sms;

import njhk.wisdom.web.bean.entity.pojo.sms.Sms;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsDao extends CrudDao<Sms> {

}
