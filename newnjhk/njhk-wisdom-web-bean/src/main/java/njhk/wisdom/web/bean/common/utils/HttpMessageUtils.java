package njhk.wisdom.web.bean.common.utils;

import java.util.HashMap;
import java.util.Map;

/**      
* @Description: http请求返回消息 --用于回答ajax请求
* @Copyright © 2018 yz-tek Co. Ltd. All Rights Reserved.
* @author hanjm@yz-tek.com   
* @date 2018年1月30日 下午3:39:20   
* @version v1.0
*
* @param
*/ 
public class HttpMessageUtils {

    public static Map<String,Object> getReturnMap(Object returnObject,String returnMessage,Integer returnCode) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", returnCode);
        map.put("message", returnMessage);
        map.put("content", returnObject);
        return map;
    }
    
}
