package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：liudenghong
 * @date ：Created in 2021/7/14 21:16
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class RegisterController {
    @RequestMapping("/register")
    public String resister(){
        return "register";
    }

}
