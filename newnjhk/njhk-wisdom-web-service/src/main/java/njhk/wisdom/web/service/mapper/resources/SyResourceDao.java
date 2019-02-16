package njhk.wisdom.web.service.mapper.resources;

import njhk.wisdom.web.bean.entity.resources.SyResource;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SyResourceDao extends CrudDao<SyResource> {
    List<SyResource> getResource();

}
