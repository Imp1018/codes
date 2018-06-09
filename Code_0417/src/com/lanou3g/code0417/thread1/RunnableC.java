package com.lanou3g.code0417.thread1;

/**
 * 实现了 Runnable 接口的对象  一定注意它不是线程
 * 而是线程中要执行的 "任务"
 */
public class RunnableC implements Runnable {

    @Override
    public void run() {
        //  线程想要执行的代码
        for (int i = 0; i < 10000; i++) {
            System.out.println("C" + i);
        }
    }
}
