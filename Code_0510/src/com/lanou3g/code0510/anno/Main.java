package com.lanou3g.code0510.anno;

/**
 * Created by dllo on 18/5/10.
 */
public class Main {
    public static void main(String[] args) {
        MyServlet myServlet = new MyServlet();

        // 获取注解里面的值
        Class Clazz = myServlet.getClass();

        // 获取注解
        MyAnno anno = (MyAnno) Clazz.getAnnotation(MyAnno.class);

        String name=anno.name();
        String path=anno.path();

        System.out.println(name);
        System.out.println(path);


    }
}
