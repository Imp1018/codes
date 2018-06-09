package com.lanou3g.code0412;

import java.util.ArrayList;

/**
 * Created by dllo on 18/4/12.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            String s = String.valueOf(c);
            arrayList.add(s);
        }
        String a = arrayList.get(arrayList.size() - 1);
        System.out.println(a);
    }

    /*
    * 泛型可以在方法上进行声明 我们管声明了泛型的方法 叫做: 泛型方法
    * 语法是:  在方法的返回值前使用<>来声明泛型 然后在这个方法中 都可以使用该泛型
    * 与泛型类不同 在调用一个泛型方法时 不需要特殊的操作
    * 泛型方法 和 static 没有任何关系
    * */
    public static <T> T getLastOne(ArrayList<T> arrayList) {
        if (arrayList.size() == 0) {
            return null;
        }
        T t = arrayList.get(arrayList.size() - 1);
        return t;
    }
}

