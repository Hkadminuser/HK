package njhk.wisdom.web.api.controller.address;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import njhk.wisdom.web.bean.common.constants.HttpConstants;
import njhk.wisdom.web.bean.common.persistence.Page;
import njhk.wisdom.web.bean.common.utils.HttpMessageUtils;
import njhk.wisdom.web.bean.entity.address.Address;
import njhk.wisdom.web.bean.entity.pojo.advice.AdvicePgd;
import njhk.wisdom.web.bean.vo.AddressAo;
import njhk.wisdom.web.service.impl.Address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Api(tags = "地址查询接口")
@Controller
@RequestMapping(value = "/address/info/*")
@Slf4j
public class WebAddressController {
    @Autowired
    private AddressService addressService;

    /**
     *
     * 添加advicepgd
     * */
    @ApiOperation(value = "查询地址", notes = "查询地址", produces = "application/json", response = Address.class)
    @RequestMapping(value = "findAddressById",method = RequestMethod.POST)
    @ResponseBody

    public Map<String,Object> findAddressById(String id){
        Address add=new Address();
        add.setId(id);
        try {
            List<AddressAo> address=addressService.findAddressById(add);
            Page<AddressAo> page=new Page<>();
            page.setList(address);
            if(address.isEmpty()){
                return  HttpMessageUtils.getReturnMap(null,"无对应数据", HttpConstants.OK);
            }
            return  HttpMessageUtils.getReturnMap(page,"地址查询成功", HttpConstants.OK);
        } catch (Exception e) {
            log.error("系统异常=====>"+e.getMessage());
            return  HttpMessageUtils.getReturnMap(e.getMessage(),"系统异常", HttpConstants.NotSupport);
        }

    }
}
