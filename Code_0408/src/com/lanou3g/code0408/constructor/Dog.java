package com.lanou3g.code0408.constructor;

/**
 * Created by dllo on 18/4/8.
 */
public class Dog {
    private String name;
    private int age;

    // 构造方法:
    // 1. 没有返回值   根本就没有写返回值的类型
    // 2. 方法名与类名相同
    //
    //构造方法只能被new这个关键字调用
    //当new对象的时候其实就是在调用构造方法
    // 例如 : new Dog();   就是在调用
    //    public Dog(){}   这个构造方法
    //   new Dog("AA")  其实就是在调用
    //      public Dog(String name){}  这个构造方法


    /*
    *    没有任何参数  方法体也是空的的构造方法
    *
    *   1. 如果我们没有写任何一个构造方法 那么 系统会送我们一个无参的构造方法(我们看不见)
    *   2. 只要我们写了任何一个构造方法 那么系统送我们的这个无参构造方法就会被收回
    */
    public Dog() {
    }

//  **********************************************

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
