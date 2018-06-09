package com.lanou3g.hw0518.study;

public class TestThreadLocal {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        threadLocal.set("HAHA");

        new Thread() {
            @Override
            public void run() {
                threadLocal.set("lalala");
                String a = threadLocal.get();
                System.out.println(Thread.currentThread().getName()+"::"+a);
            }
        }.start();

        Thread.sleep(1000);

        String string = threadLocal.get();
        System.out.println(Thread.currentThread().getName()+"::"+string);
    }
}
