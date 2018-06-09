package com.lanou3g.code0417.thread1;

/**
 * 在 java中 我们的线程都要继承Thread类
 * 而线程具体要执行什么代码 我们可以把要执行的代码放入到Thread类中的run方法里
 * 当线程启动的时候就会自动的执行run方法里面的内容
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        // 当线程运行的时候 会自动的执行里面的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("A" + i);
        }
    }
}
