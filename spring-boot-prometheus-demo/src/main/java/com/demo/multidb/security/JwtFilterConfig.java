package com.demo.multidb.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtFilterConfig {

    @Autowired
    public JwtFilterConfig(FilterRegistrationBean filterRegistrationBean) {
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.addUrlPatterns("/api/*"); // Specify the URL patterns to intercept
    }
}
