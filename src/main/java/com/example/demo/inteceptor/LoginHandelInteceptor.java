package com.example.demo.inteceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：liudenghong
 * @date ：Created in 2021/7/31 21:36
 * @description：
 * @modified By：
 * @version: $
 */
public class LoginHandelInteceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }
}
