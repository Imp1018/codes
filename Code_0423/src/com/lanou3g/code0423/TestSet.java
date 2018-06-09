package com.lanou3g.code0423;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 18/4/23.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        // set 是集合
        // 1. set中不能添加重复性的数据
        // 2. set没有办法根据下标拿数据 即 没有办法取出指定数据 要想使用set中的数据 只能遍历
        // 3. set里面的数据是没有顺序可言的 无论你以什么样的顺序向set中添加数据 遍历取出的数据顺序都是不一定和添加的顺序一样
        // 4.
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
