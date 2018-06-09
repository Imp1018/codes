package com.lanou3g.code0510.reflection;

/**
 * Created by dllo on 18/5/10.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        反射是一种 在程序运行期间 动态生效的技术,可以做到不使用硬编码
//        1.创建对象
//        Person person=new Person();
//        获取类类型的第一种方式
        Class pClazz = Person.class;
        Object o = pClazz.newInstance();
//        通过类名获取类类型2
        Class Clazz = Class.forName("com.lanou3g.code0510.reflection.Person");
//       获取类类型3 通过对象获取
        Person person = new Person();
        Class Clazz3 = person.getClass();

//        2.给属性赋值
        // 详情见Test2
//        3.调用方法
    }
}
