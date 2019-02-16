package njhk.wisdom.web.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket systemApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("系统接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.system"))
                .paths(PathSelectors.any()).build();
    }
    @Bean
    public Docket customerApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("老人信息获取接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.customer"))
                .paths(PathSelectors.any()).build();
    }
    @Bean
    public Docket servicePgdApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("工单信息获取接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.serve"))
                .paths(PathSelectors.any()).build();
    }
    @Bean
    public Docket serveStationApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务站信息获取接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.serve"))
                .paths(PathSelectors.any()).build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("禾康养老平台接口").description("禾康养老平台接口").termsOfServiceUrl("")
                .contact(new Contact("", "", "")).version("1.0").build();
    }
    @Bean
    public Docket volunteerApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("志愿者信息表接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.volunteer"))
                .paths(PathSelectors.any()).build();
    }
    @Bean
    public Docket webServeGroupApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务组信息接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.serve.serveGroup"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket webServePersonApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务人员信息接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.serve.servePerson"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket webServeStationApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务站信息接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.serve.serveStation"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket webServeTypeApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务类型信息接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.serve.serveType"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket webCustomerApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务对象信息接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.customer.webcustomer"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket webServicePgdApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("服务工单信息接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.service"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket webAddressApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("地址信息接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.address"))
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public Docket webSyuserApi(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("用户接口").apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("njhk.wisdom.web.api.controller.syuser"))
                .paths(PathSelectors.any()).build();
    }

}
