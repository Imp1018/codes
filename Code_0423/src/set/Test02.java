 package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by dllo on 18/4/23.
 */
public class Test02 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // Set<Integer> set1=new LinkedHashSet<>();  可以实现集合的有序排列  重复数据也不可以出现
        // set= new TreeSet<>();   也可以实现集合的有序排列
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);


        // 获取迭代器
        Iterator<Integer> iterator = set.iterator();
        // 只要迭代器 有下一个元素
        while (iterator.hasNext()) {
            // 从迭代器取下一个元素
            Integer i = iterator.next();
            if (i % 2 == 0) {
                // 使用迭代器删除元素
                iterator.remove();
            }
            System.out.println(i);
        }
        System.out.println("删除后");
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
