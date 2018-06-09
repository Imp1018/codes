package com.lanou3g.code0408.permission;

/**
 * Created by dllo on 18/4/8.
 */
public class Foo {
    private String name;
    public void fun(String name){
        this.name=name;

    }
    public void fun(){
        this.name="张三";
       String name="李四";
        System.out.println(name);
        //  在方法中定义的变量 叫局部变量
        //  局部变量只能够在这个方法中使用 且 使用的时候不能加this
        //  也没有办法通过对象.XX的方式 使用到局部变量
        String gender="男";

        //  如果局部变量和全局变量重名了
        //  不写this 指的是 局部变量
        //  写this   指的是 全局变量
        name="张四";
        this.name="马五";

    }
}
