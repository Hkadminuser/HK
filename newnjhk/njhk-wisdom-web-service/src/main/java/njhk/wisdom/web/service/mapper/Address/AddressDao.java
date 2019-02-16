package njhk.wisdom.web.service.mapper.Address;

import njhk.wisdom.web.bean.entity.address.Address;
import njhk.wisdom.web.bean.vo.AddressAo;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao extends CrudDao<Address> {
    List<AddressAo> findAddressById(Address add);
}
