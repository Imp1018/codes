package control;

/**
 * Created by dllo on 18/4/18.
 */
public class Test02 {
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        a.start();

        try {
            // 调用线程对象的join方法
            // 可以让 当前线程 等待 线程对象执行完毕后
            // 再继续执行
            // 在哪个线程中调用的线程对象.join()
            // 哪个线程就去等
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程执行完毕");
    }
}
