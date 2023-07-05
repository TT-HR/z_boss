package com.example.zboss.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yhr
 * @date 2023/7/5-10:23
 */
@Slf4j
@Configuration
public class ControllerFilter {
    @Bean
    @Order(Integer.MIN_VALUE)
    @Qualifier("filterRegistration")
    public FilterRegistrationBean filterRegistration() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(controllerFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

    private Filter controllerFilter() {
        return new Filter() {
            @Override
            public void init(FilterConfig filterConfig) {
                log.info("ControllerFilter初始化成功");
            }

            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
                HttpServletRequest request = (HttpServletRequest) servletRequest;
                HttpServletResponse response = (HttpServletResponse) servletResponse;
                log.info("Http请求信息 : {\"URI\":\"" + request.getRequestURL() +
                        "\",\"RequestMethod\":\"" + request.getMethod() +
                        "\",\"Content-Type\":\"" + request.getContentType() +
                        "\"}");
                chain.doFilter(request, response);
            }

            @Override
            public void destroy() {
                log.info("ControllerFilter摧毁");
            }
        };
    }
}
