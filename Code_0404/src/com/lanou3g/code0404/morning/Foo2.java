package com.lanou3g.code0404.morning;

/**
 * Created by dllo on 18/4/4.
 */
//返回值
public class Foo2 {
    /*
    *      1. add 方法作用 : 接受两个int 类型的值 并求和
    *      2. int add(int num1,int num2 ){}
    *       中 第一个int 叫做返回值类型
    *       用来表示: 这个方法可以返回给调用方法 一个什么类型的数据
    * */

    int add(int num1, int num2) {
        int result = num1 + num2;
        // 如果返回值类型这里写的不是void 则这个方法必须有明确的返回值 即 必须写出 return 关键字
        // return 关键字后跟着要返回的结果
        return result;
    }

    void fun() {
        System.out.println("这个方法没有返回值");
    }
     /*
     * return 专门用在方法中
     * 这个关键字的作用: 直接结束一个方法
     * 即 在return后的代码 全部不会执行
     * 如果一个方法声明了有返回值 那么必须写return 返回值
     * 如果一个方法声明了没有返回值(void) 那么可以省略return
     * 并且 由于 没有返回值 那么 即使写了 return后面也不需要写
     * 要返回的值
     * */


    /*
    * 打印一个数组
    * */

    void printArr(int[] arr) {
        // 这个if不写 就是契约式编程
        if (arr == null) {
            //防御式编程
            System.out.println("有没有new 没点数么");
            // 当执行到return时 方法会无条件结束
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }

    // 但凡我们要改变一个字符串的值
    // 就必须有返回值
    String fun3(String s) {
        s = "Echo:" + s;
        return s;
    }

    Table fun4(Table a) {
        a = new Table();
        a.color = "red";
        a.legCount = 4;
        return a;
    }

    // 可以用 ... 表示不确定个数的参数 不常用
    // 在方法里使用的时候 nums就是个int类型的数组
    int addAll(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}


