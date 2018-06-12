package com.lanou.test;

import com.lanou.service.PersonService;
import com.lanou.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAopTest2 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

        UserService userService = ac.getBean(UserService.class);

        System.out.println(userService.getClass());

        userService.add();

    }
}
