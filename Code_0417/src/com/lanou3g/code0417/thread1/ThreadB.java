package com.lanou3g.code0417.thread1;

/**
 * Created by dllo on 18/4/17.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("B" + i);
        }
    }
}
