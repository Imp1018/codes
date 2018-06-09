package com.lanou.controller;

import com.lanou.entity.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/phone")
public class PhoneController {

    @RequestMapping("/add")
    public void add(@Valid Phone phone, BindingResult br) {
        if (br.hasErrors()){
//            FieldError brandError = br.getFieldError("brand");
//            System.out.println(brandError.getDefaultMessage());
            System.out.println("没有通过校验");
        }else {
            System.out.println("通过校验");
        }

    }
}
