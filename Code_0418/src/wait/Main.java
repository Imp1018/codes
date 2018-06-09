package wait;

/**
 * wait() 和  sleep() 区别
 * 共同点: 都会让程序停止
 * 区别:
 * 1.wait()是Object类的方法 任何对象都有
 * 而sleep是Thread类的方法
 * 2.wait()必须写在synchronized 代码块中 并且必须是锁对象调用wait()方法 而 sleep没有限制(不需要synchronized)
 * 3.wait()会释放锁对象 而sleep()不会释放锁
 * 4.wait()可以被别的线程唤醒 而sleep()需要等待时间结束
 */
public class Main {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread a = new Thread() {
            @Override
            public void run() {
                System.out.println("a线程开始了");
                synchronized (lock) {
                    try {
                        lock.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("a线程结束了");
            }
        };
        a.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("准备唤醒a线程");
        synchronized (lock) {
            lock.notify();
        }

    }
}
