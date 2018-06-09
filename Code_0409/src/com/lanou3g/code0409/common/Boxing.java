package com.lanou3g.code0409.common;

/**
 * Created by dllo on 18/4/9.
 */
public class Boxing {
    public static void main(String[] args) {
        //Java 造了8个类 分别对应 8个基本数据类型
        //这8个类 统一称为 基本数据类型的包装类
        // 8个基本数据类型的包装类
        // 如果像普通对象一样需要 new 来创建
        // 那么就太麻烦了,就没人用了
        // 所以 Java 针对这8个 单独优化了
        // 不需要创建对象,在使用的时候,直接把原来的基本数据类型
        // 改成对应的包装类类型,即可
        // 这种 由 基本数据类型 自动的 变为包装类型的过程
        // 叫做包装类

        // 所有的包装类 就当基本数据类型用
        // 效果完全一样
        Byte b = (byte) 1;
        Short s = (short) 1;
        Integer i = 1;
        Long l = 1L;

        Float f = 3.14f;
        Double d = 3.14d;

        Character c = 'A';

        Boolean bool = false;

        //  int => String
        //  String.valueOf(int)
        //  String =>  int
        // Integer.valueOf(String)
        // 包装类的好处:  可以把String转成对应的基本数据类型了

        int a = Integer.valueOf((char) 'A');
        a += 5;
        System.out.println(a);

    }
}
