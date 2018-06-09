package com.lanou3g.code0510.reflection;

import java.lang.reflect.Field;

/**
 * Created by dllo on 18/5/10.
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        // 通过反射操作属性
        Person person = new Person();
        person.setName("张三");
        person.setAge(18);

        Class Clazz = person.getClass();
        // 获取所有属性
        // declared 叫做声明的
        // 表示 这个类只要写了 就能拿到
        Field[] fields = Clazz.getDeclaredFields();
        for (Field field : fields) {
            // 循环拿到每一个成员变量
            // 让这个成员变量可以被访问(突破权限)
            field.setAccessible(true);
            // 获取变量名
            String name = field.getName();
            // 获取变量值
            Object value = field.get(person);

            String typeName = field.getType().getSimpleName();

            System.out.println(name + "-" + value + "-" + typeName);
        }
        Field nameField = Clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        // person.name="李四"
        nameField.set(person, "李四");
        System.out.println(person.getName());
    }
}
