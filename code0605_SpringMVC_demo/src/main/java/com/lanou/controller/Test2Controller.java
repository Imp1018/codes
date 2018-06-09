package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {
    @RequestMapping("/test1")
    public String text1() {
        System.out.println("test1----------------");
        // 返回逻辑试图index,获得物理试图/index.jsp
        return "index";
    }


    @RequestMapping("/test2")
    public String text2() {
        System.out.println("test2----------------");
        // 返回逻辑试图index,获得物理试图/index.jsp
        return "index";
    }
}
