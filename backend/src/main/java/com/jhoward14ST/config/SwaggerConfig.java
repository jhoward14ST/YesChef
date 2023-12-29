package com.jhoward14ST.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host("localhost:8080")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jhoward14ST.controllers"))
                .paths(PathSelectors.any())
                .build();
    }
}