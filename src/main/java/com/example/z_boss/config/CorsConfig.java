package com.example.z_boss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yhr
 * @date 2023/7/5-10:20
 */
@Configuration
public class CorsConfig {
        @Bean
        public CorsFilter corsFilter() {
            //1.添加CORS配置信息
            CorsConfiguration config = new CorsConfiguration();
            //放行哪些原始域
            config.addAllowedOrigin("*");
            //是否发送Cookie信息
            config.setAllowCredentials(true);
            //放行哪些原始域(请求方式)
            config.addAllowedMethod("*");
            //放行哪些原始域(头部信息)
            config.addAllowedHeader("*");

            //2.添加映射路径
            UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
            configSource.registerCorsConfiguration("/**", config);

            //3.返回新的CorsFilter.
            return new CorsFilter(configSource);
        }
}
