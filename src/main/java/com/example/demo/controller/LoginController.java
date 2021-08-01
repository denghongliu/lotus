package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：liudenghong
 * @date ：Created in 2021/7/11 22:23
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    /**
     * 这里首页登录页面
     * @return
     */

    @GetMapping({"/","/login"})
    public String index(){
        return "login";
    }

    @GetMapping("/home")
    public String home(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord, Model model){
        if ("123".equals(userName)){
            User user = new User();
            user.setAge(11);;
            user.setName("刘登洪");
            userMapper.insert(user);

            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }

        return "redirect:/content/index.html";
    }

}
