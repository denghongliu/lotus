package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：liudenghong
 * @date ：Created in 2021/7/11 22:23
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class LoginController {

    @GetMapping({"/","/login"})
    public String index(){
        return "login";
    }


}
