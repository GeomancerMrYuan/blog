package com.mryuan.system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger配置类,相当于一个xml文件
 */
@Configuration  //类似@Component,将这个类交给spring容器管理,单例
@EnableSwagger2  //开启swagger注解
public class SwaggerConfig{

    @Value("${swagger.enable:true}")
    private Boolean flag;

    /**
     * docket:清单,用于配置swagger
     * 头部信息
     * Swagger开关
     * API分组
     * 扫描接口
     * 配置请求头(token,cookie...)--认证(感谢李伟业同学提出的问题)
     * @return
     */
    @Bean //往容器中注入一个docket实例
    public Docket api() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        tokenPar.name("Authorization").description("Authorization").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                //配置头部信息
                .apiInfo(new ApiInfoBuilder()
                        .title("博客")
                        .description("博客系统接口文档")
                        .version("v2020.07")
                        .build())
                //API分组
                .groupName("博客系统")
                //配置request_header
                .globalOperationParameters(pars)
                //Swagger开关
                .enable(flag)
                //匹配api路径
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mryuan.vueblog.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
