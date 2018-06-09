package com.lanou3g.code0411.list;

import java.util.ArrayList;

/**
 *               ArrayList
 */
public class Main {
    public static void main(String[] args) {
        // 用法 和 MyArray一样
        ArrayList<String> arrayList = new ArrayList<>();
        // 放入元素
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("Hello");
        // 根据下标 取出元素
        String s = arrayList.get(0);
        System.out.println(s);

        for (int i = 0; i < arrayList.size(); i++) {
            String s1 = arrayList.get(i);
            System.out.println(s1);
        }
        // 将指定元素 添加到指定位置
        arrayList.add(0, "AAA");
        // 删除指定位置的元素
        arrayList.remove(3);
        // 将指定位置的元素更改为新元素
        arrayList.set(1, "BBB");
        System.out.println("*****************");
        // 增强for循环(内部使用迭代器去循环)
        // 他的效率要略低于for循环 不过不用在意
        for (String s2 : arrayList) {
            System.out.println(s2);
        }
    }


}
