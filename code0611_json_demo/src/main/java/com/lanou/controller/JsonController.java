package com.lanou.controller;

import com.lanou.entity.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
    @RequestMapping("/json")
    @ResponseBody
    public Phone json(@RequestBody Phone phone) {
        System.out.println(phone.getPrice());
        return phone;
    }
}
