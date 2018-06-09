package com.lanou3g.code0417.tickets;

/**
 * 售票站
 */
public class TicketOffice {
    private int ticket = 100;   // 有100张票
    private final Object lock = new Object();

    // 返回值代表 是否还有票
    public boolean sellTicket() {
        /**
         * 为了解决线程安全问题 java引入了同步安全机制 :synchronized
         * 语法:synchronized(lock){
         *     只能一时间由一个线程访问
         * }
         *
         * 大括号内的代码 在同一时间 只能被一个线程调用
         * 即使线程在大括号内停止了 其他线程也无法进入到大括号内
         *
         * 小括号内 我们称之为 锁对象 可以是任意的对象
         * 但是要注意 成为锁对象的对象 不能再改变了
         * 一般的 我们都会为锁对象 加上 final 防止它改变
         */
        synchronized (lock) {
            if (ticket <= 0) {
                return false;
            }
            try {
                //  让当前线程停止100毫秒
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "卖出一张票,还剩:" + ticket + "张");
            return true;
        }
    }

    //   在方法的返回值前 可以加上synchronized关键字
    //   相当于把整个方法都放到同步代码块中
    //   不需要写锁对象 这时 锁对象是 类名.class(这个类的 类对象JVM加载这个类时 自动创建的)
            public synchronized void fun() {

    }
}
