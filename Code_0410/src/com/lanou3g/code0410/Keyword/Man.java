package com.lanou3g.code0410.Keyword;

/**
 * static 叫做静态
 * 可以修饰 全局变量 , 方法
 * 被static修饰过的变量 叫 静态变量
 * 被static修饰过的方法 叫 静态方法
 *
 * 1.静态变量和静态方法 都不需要创建对象
 *   直接使用 类名.方法()  类名.属性 进行调用
 * 2.static方法中只能直接调用其他static方法或static变量
 *   直接调用的意思是:这个类中的 普通方法 和 普通全局变量
 *   是需要先创建对象再去调用的
 * 3.static最常用的地方 就是和final一起把一个变量变成常量
 *   public static final 变量类型 变量名=值;
 *   static 负责能直接通过类名.变量名的方式使用
 *   final 负责 这个变量值无法被改变
 *   常量名 需要 只由大写字母,数字和下划线组成 单词直接由下划线分割
 */
public class Man extends Person {
    public static final String SEX="男";
    public static int a ;

    public void fun1(){

    }
    public static void fun2(){

    }
}
