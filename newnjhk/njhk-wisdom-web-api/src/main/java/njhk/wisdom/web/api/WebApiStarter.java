package njhk.wisdom.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ForrestCao
 * web-api starter
 */
@Configuration
@EnableConfigurationProperties
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(value = "njhk.wisdom.web.*", lazyInit = true)
public class WebApiStarter {

	public static void main(String[] args) {

		SpringApplication.run(WebApiStarter.class, args);
	}
}
