package com.lanou3g.code0404.morning;

/**
 * Created by dllo on 18/4/4.
 */
public class Main {
    public static void main(String[] args) {

        Table table = new Table();
        table.legCount = 3;
        table.color = "红色";
        table.show();


        Foo foo = new Foo();
        int a = 3;
        foo.fun(a, table);
        System.out.println("----->" + a);
        table.show();

        foo.fun2(table);
        table.show();

        String s = "Hello";  //  不需要真的写出new 直接把双引号里的内容赋值过去 就相当于new了
        foo.fun3(s);
        System.out.println(s);


    }


}

