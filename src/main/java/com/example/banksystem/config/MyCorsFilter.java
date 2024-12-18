package com.example.banksystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class MyCorsFilter {
    @Bean

    public CorsFilter corsFilter(){
        //创建配置对象
        CorsConfiguration config = new CorsConfiguration();
        //支持域
        config.addAllowedOriginPattern("*");
        config.setAllowCredentials(true);
        //支持请求方式
        config.addAllowedMethod("*");
        //添加地址映射
        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/**",config);
        //返回对象
        return new CorsFilter(corsConfigurationSource);
    }
}
