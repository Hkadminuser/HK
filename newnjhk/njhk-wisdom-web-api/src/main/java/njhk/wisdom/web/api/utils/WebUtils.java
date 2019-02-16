package njhk.wisdom.web.api.utils;

import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

public class WebUtils {
    public static <T> T Requst2Bean(HttpServletRequest request, Class<T> bean) {
        T t = null;
        try {
            t = bean.newInstance();
            Enumeration parameterNames = request.getParameterNames();
            DateConverter convert = new DateConverter();//写一个日期转换器
            String[] patterns = { "yyyyMMdd", "yyyy-MM-dd" };//限定日期的格式字符串数组
            convert.setPatterns(patterns);
            ConvertUtils.register(convert, Date.class);
            while (parameterNames.hasMoreElements()) {
                String name = (String) parameterNames.nextElement();
                String value=null;
                if ("ids".equals(name)){
                    String[] v = request.getParameterValues(name);
                    value=v.toString();
                }else {
                    value = request.getParameter(name);
                }
                if("undefined".equals(value)){
                    BeanUtils.setProperty(t, name, null);//使用BeanUtils来设置对象属性的值
                }else{
                    BeanUtils.setProperty(t, name, value);//使用BeanUtils来设置对象属性的值
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return t;

    }
}
