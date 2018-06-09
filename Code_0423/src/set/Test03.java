package set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 18/4/23.
 */
public class Test03 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();
        Foo foo3 = new Foo();


    }

    private static void show(Set<Integer> set) {
//        for (Integer integer : set) {
//            System.out.println(integer);
//        }
        Set<Integer> set1 = new HashSet<Integer>() {{
            // 在构造代码块中初始化数据
            add(1);
            add(2);
        }};
        show(set1);
    }
}
