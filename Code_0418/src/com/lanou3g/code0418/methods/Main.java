package com.lanou3g.code0418.methods;

/**
 * Created by dllo on 18/4/18.
 */
public class Main {
    public static void main(String[] args) {
        // currentThread() 可以返回当前方法所在的线程对象
        Thread thread = Thread.currentThread();

        try {
            // 让线程沉睡多少毫秒 该方法会抛出一个异常
            // 需要try-catch
            // 并且 线程在沉睡的时候  不会释放锁
            Thread.sleep(1000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //  获取线程名字
        System.out.println(thread.getName());


    }
}
