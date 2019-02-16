package njhk.wisdom.web.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 科赢服务启动器
 *
 * @author juxiang
 */
@EnableConfigurationProperties
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(value = "njhk.wisdom.web.service.*", lazyInit = true)
public class LawServiceStarter {

    public static void main(String[] args) {
        try {
            SpringApplication.run(LawServiceStarter.class, args);
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
