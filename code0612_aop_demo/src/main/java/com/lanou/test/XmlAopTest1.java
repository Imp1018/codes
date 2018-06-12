package com.lanou.test;

import com.lanou.service.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAopTest1 {
    public static void main(String[] args) {
        //    加载Spring配置文件
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        //    调用getBean方法取得被实例化的class对象
        PersonService personService = ac.getBean(PersonService.class);

        System.out.println(personService.getClass());

        personService.add();

        personService.delete();

        personService.update();

        personService.select();
    }
}
