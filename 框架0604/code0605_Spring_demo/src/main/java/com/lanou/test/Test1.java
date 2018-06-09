package com.lanou.test;

import com.lanou.entity.Dog;
import com.lanou.entity.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        //1.获取IOC容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //System.out.println("*************"+ac+"***********");

        //2.通过IOC容器获取bean
        Person person = (Person) ac.getBean("person");
        System.out.println(person);

//        Dog dog = ac.getBean(Dog.class);
//        System.out.println(dog);


    }

}
