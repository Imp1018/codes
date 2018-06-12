package com.lanou.test;

import com.lanou.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoAopTest1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");

        PersonService personService = ac.getBean(PersonService.class);

        System.out.println(personService.getClass());

        personService.add();

        personService.delete();

        personService.update();

        personService.select();
    }
}
