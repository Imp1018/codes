package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class test1 {
    @RequestMapping("/sm")
    public class SpringMVCTest {
        private static final String SUCCESS = "success";
        //了解：不常用， 可以使用params和header来更加精确的映射请求，他两支持简单的表达式
        @RequestMapping(value="testParamsAndHeader",params={"username","age!=24"},headers={"Accept-Language=zh-CN,zh;q=0.8"})
        public String testParamsAndHeader(){
            System.out.println("testParamsAndHeader...");
            return SUCCESS;
        }}
}
