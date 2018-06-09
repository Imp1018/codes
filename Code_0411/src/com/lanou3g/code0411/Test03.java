package com.lanou3g.code0411;

/**
 * Created by dllo on 18/4/11.
 */
public class Test03 {
    public static void main(String[] args) {
        MyArray<String> stringMyArray = new MyArray<>();

        stringMyArray.put("Hello");
        stringMyArray.put("World");

        for (int i = 0; i < stringMyArray.size(); i++) {
            String s = stringMyArray.get(i);
            System.out.println(s);
        }
    }
}
