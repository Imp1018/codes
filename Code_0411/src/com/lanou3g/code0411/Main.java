package com.lanou3g.code0411;

/**
 * Created by dllo on 18/4/11.
 */
public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        String a = "你好";
        String b = "你的名字是";

        myArray.put(a);
        myArray.put(b);

        String a1 = (String) myArray.get(0);
        String a2 = (String) myArray.get(1);

        System.out.println(a1);
        System.out.println(a2);

        for (char c = 'a'; c <= 'z'; c++) {
            String s = String.valueOf(c);
            myArray.put(s);
        }

        for (int i = 0; i <myArray.size() ; i++) {
            String s= (String) myArray.get(i);
            System.out.println(s);
        }

    }
}
