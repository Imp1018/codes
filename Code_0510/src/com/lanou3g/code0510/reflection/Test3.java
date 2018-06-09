package com.lanou3g.code0510.reflection;

import java.lang.reflect.Method;

/**
 * Created by dllo on 18/5/10.
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        // 通过反射调用方法
        Person person = new Person();
        person.setAge(18);
        person.setName("张三");

        Class Clazz = person.getClass();
        Method showMethod=Clazz.getDeclaredMethod("show");
        //让方法能被调用(包括私有方法)
        showMethod.setAccessible(true);
        showMethod.invoke(person);
    }
}
