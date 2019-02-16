package njhk.wisdom.web.service.mapper.notice;

import njhk.wisdom.web.bean.entity.other.Notice;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeDao extends CrudDao<Notice> {
}
