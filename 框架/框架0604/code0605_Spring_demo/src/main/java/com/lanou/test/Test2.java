package com.lanou.test;


import com.lanou.entity.Bottom;
import com.lanou.entity.Car;
import com.lanou.entity.Framework;
import com.lanou.entity.Tire;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        //Car car=new Car(new Framework(new Bottom(new Tire(30))));

        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = ac.getBean(Car.class);
        System.out.println(car.getFramework().getBottom().getTire().getSize());
    }
}
