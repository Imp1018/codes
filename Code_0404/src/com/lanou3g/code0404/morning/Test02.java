package com.lanou3g.code0404.morning;

/**
 * Created by dllo on 18/4/4.
 */
public class Test02 {
    public static void main(String[] args) {
        Foo2 foo2 = new Foo2();
        int a = foo2.add(3, 5);
        System.out.println(a);


        foo2.add(4, 5);
        // 即使该方法声明的时候 有返回值
        // 但是 我们也可以选择不去使用这个返回值

        foo2.fun();
        // 如果一个方法没有返回值 那么我们是不能找变量去接收


        int[] arr = {1, 3, 5, 7, 9, 2};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = null;
        foo2.printArr(arr);
        foo2.printArr(arr2);
        foo2.printArr(arr3);


        System.out.println("*********");
        String s = "你好";
        s = foo2.fun3(s);
        System.out.println(s);

        Table table = new Table();
        table.color = "赭石色";
        table.legCount = 8;
        table = foo2.fun4(table);
        table.show();


        System.out.println("===============");
        // 这个方法 传入几个int值都行
        int sum1 = foo2.addAll(3, 5, 6, 2, 4);
        int sum2 = foo2.addAll(1, 5, 3, 7, 9);


    }


}
