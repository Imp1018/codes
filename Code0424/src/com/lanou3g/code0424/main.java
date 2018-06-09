package com.lanou3g.code0424;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * HashMap 是一种 key-value(k-v)的 数据类型
 * 可以把它理解为一个数组,只不过下标可以是任意的数据类型
 * 要想取map中储存的value,只能通过key来取
 * 对于一个map来说 它当中的key 是不能重复的
 * 一个key必须对应一个确定的值 但是 值是可以重复的
 * 如果向map中 放入了 已有的key 就会把之前的key-value覆盖
 * map 中的key value 都可以是null
 * 如果想要获取一个map中所有的数据 但是又不知道里面有什么key
 * 那么 可以先通过keyset()方法 去获取一个所有key的集合
 * 再遍历一遍这个集合 取出每一个key 就可以通过key来取value
 * hashmap 是线程不安全的
 */
public class main {
    public static void main(String[] args) {
//        Set<String>strings=new HashSet<>();
//        strings.add("aaa");
//        strings.add(null);
//        strings.add(null);
//
//        for (String string : strings) {
//            System.out.println(string);     // 需要判断是否为空  为空的话取出来是空指针异常
//        }
//        System.out.println(strings.size());
//    }
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "aaaa");
        map.put(1, "2222");

        System.out.println(map.get(0));
        System.out.println(map.get(1));


        Map<String, String> map1 = new HashMap<>();
        Set<String> strings = map1.keySet();
        for (String string : strings) {
            String value = map1.get(string);
            System.out.println(value);
        }

    }

}