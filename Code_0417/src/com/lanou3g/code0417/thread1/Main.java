package com.lanou3g.code0417.thread1;

/**
 * 线程 是计算机资源调度的最小单位
 * 并不是java中的概念 所有的计算机基本上都有线程的概念
 * 线程是为了让计算机在同一时间能做不同的事情
 * 本质上就是CPU等资源在不断的切换线程的执行
 */
public class Main {
    public static void main(String[] args) {
        Thread a = new ThreadA();
        Thread b = new ThreadB();
        // 定义线程的第二种方式
        // 直接创建Thread类的对象
        // 把Runnable的实现类对象  通过Thread类的
        // 构造方法传入线程中
        RunnableC runnableC = new RunnableC();
        Thread c = new Thread(runnableC);

        for (int i = 0; i < 10000; i++) {
            System.out.println("m" + i);
        }
        // 启动线程
        // 使用线程对象的start方法
        // 来启动一个线程
        // 启动之后 这个线程就交给操作系统了 会自动的执行里面的 run方法
        // psvm也是在一个线程中的 这个线程我们通常叫做主线程
        a.start();
        b.start();
        c.start();   // 启动线程


    }

}
