package com.lanou3g.code0417.thread1;

/**
 * Created by dllo on 18/4/17.
 */
public class Test02 {
    public static void main(String[] args) {
        //创建对象   //调用方法
        new ThreadA().start();
        // 匿名对象   直接new出对象而不给这个对象变量名
        // 在new完之后 可以直接调用对象的方法
        // 并且只有这一次调用方法的机会

        System.out.println("----------------------->");

        // 匿名内部类
        // 匿名指的是没有类名
        // 在构造方法的小括号后 和 分号前 加上大括号
        // 那么大括号就代表是一个类
        // 如下代表 创建了一个没有类名的 Thread类的子类
        // 同样可以覆写父类(Thread)中的方法
        Thread a = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };
        a.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                }
            }
        }).start();

    }
}
