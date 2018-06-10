package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebAppConfig extends WebMvcConfigurerAdapter {

    /*
    * 配置跨域请求
    * @param registry CorsRegistry
    * */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "DELETE", "POST", "PUT", "OPTIONS", "PATCH")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
