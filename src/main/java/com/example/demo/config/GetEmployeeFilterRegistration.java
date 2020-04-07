package com.example.demo.config;

import com.example.demo.filter.GetEmployeesFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetEmployeeFilterRegistration {

    @Bean
    public FilterRegistrationBean<GetEmployeesFilter> registrationBean(){
        FilterRegistrationBean<GetEmployeesFilter> bean = new FilterRegistrationBean<>();

        bean.setFilter(new GetEmployeesFilter());
        bean.addUrlPatterns("/employee/*");

        return bean;
    }
}
