package com.lanou.bbs.controller;

import com.lanou.bbs.entity.User;
import com.lanou.bbs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session, Model model) throws SQLException {
        // 调用service 获取登陆结果
        User u = userservice.login(user);
        // 判断登录结果
        if (u != null) {
            // 将登陆成功的USer存session中,以保证登陆状态
            session.setAttribute("user", u);
            // 跳转到主页
            return "redirect:/index.jsp";
        } else {
            // request中存失败信息
            model.addAttribute("msg", "用户名或密码错误");
            model.addAttribute("user", user);
            // 跳转到登录页面
            return "login";
        }

    }

    @RequestMapping("/register")
    public String register(User user, Model model) throws SQLException {
        boolean rs = userservice.register(user);
        if (rs) {
            return "redirect:toLogin";
        } else {
            model.addAttribute("msg", "注册失败");
            return "register";
        }
    }
}
