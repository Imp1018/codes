package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test1")
    public String test1() {
        System.out.println("test1++++++++");
        return "/index.jsp";
    }

    @RequestMapping("/a/test2")
    public String test2() {
        System.out.println("test2++++++++");
        return "/index.jsp";
    }

    @RequestMapping("/b/test3")
    public String test3() {
        System.out.println("test3++++++++");
        return "/index.jsp";
    }

    @RequestMapping("/c/test4")
    public String test4() {
        System.out.println("test4++++++++");
        return "/index.jsp";
    }
}
