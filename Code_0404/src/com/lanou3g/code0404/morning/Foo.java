package com.lanou3g.code0404.morning;

/**
 * Created by dllo on 18/4/4.
 */
public class Foo {
    void fun(int a, Table table) {
        a++;                       //a = a + 1;
        table.legCount++;         //table.legCount = table.legCount + 1;
    }

    void fun2(Table t) {
        t = new Table();
        t.color = "绿色";
        t.legCount = 5;
    }

    void fun3(String a) {
        a += "你好";
    }
}
