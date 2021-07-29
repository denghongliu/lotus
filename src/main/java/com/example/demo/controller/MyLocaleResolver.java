package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author ：liudenghong
 * @date ：Created in 2021/7/26 22:29
 * @description：
 * @modified By：
 * @version: $
 */

public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        Locale local = Locale.getDefault();
        String lang=request.getParameter("lange");
        if (!StringUtils.isEmpty(lang)){
            String[] split = lang.split("_");
            local= new Locale(split[0],split[1]);
        }

        return local;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
