package com.example.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @author ：liudenghong
 * @date ：Created in 2021/7/13 22:55
 * @description： 路由配置和国际化配置路径
 * @modified By：
 * @version: $
 */
@Controller
public class UsingStaticController extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
