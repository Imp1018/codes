package com.lanou3g.code0408.constructor;

/**

 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("毛毛");
        Dog dog1 = new Dog();
//        Dog dog2 = new Dog(7, "毛毛");
//        dog.setName("毛毛");
        dog.setAge(7);

        Cat cat = new Cat("毛豆");
        System.out.println(cat.getName());

        Mouse mouse=new Mouse("小米","白色","蓝牙");

        Mouse mouse1=new Mouse();
        mouse1.setBrand("雷蛇");
        mouse1.setColor("黑色");
        mouse1.setWay("有线");
    }

}