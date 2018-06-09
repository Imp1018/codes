package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dllo on 18/4/12.
 */
public class Main {
    /*
    * ArrayList 是使用数组来实现的
    * LinkedList 是使用链表来实现的
    * 所以ArrayList 在读取元素 改变指定元素值的方面 比较快(可以直接使用下标去做)
    * LinkedList在增加元素 删除元素方面比较快(可以通过改变元素的指向来完成)
    * 如果在实际开发中,读取比较频繁 插入 删除 比较不频繁使用ArrayList
    * 如果 插入 删除 比较频繁, 使用LinkedList
    * 不管使用哪种 在定义的时候/方法的参数中
    * 都使用它们共同的接口 List<E>,这样以后再改动的时候比较方便
    * */
    List<String> strings = new ArrayList<>();
    List<String> strings1 = new LinkedList<>();
}
