package com.lanou.controller;

import com.lanou.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public String login(@RequestParam(value = "username",required = true) String uname, String password, int age, @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println(uname);
        System.out.println(password);
        System.out.println(age);
        System.out.println(birthday);
        return null;
    }


    @RequestMapping("/login1")
    public String login1(User user) {
        System.out.println(user.getAge());
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        System.out.println(user.getBirthday());
        return null;
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) throws ServletException, IOException {
        // 转发
        //   request.getRequestDispatcher("/1.jsp").forward(request,response);
//        return "1";
//        response.sendRedirect("/1.jsp");
//        return null;
        model.addAttribute("msg","呵呵");
        session.setAttribute("msg","哈哈");
        return "1";
    }
    @RequestMapping(value = {"/get","/get1"},method = RequestMethod.GET)
    public String get(){
        return null;
    }
    @RequestMapping({"/{id}","/{name}"})
    public void findById(@PathVariable int id,@PathVariable String name){
        System.out.println(id);
    }

}

