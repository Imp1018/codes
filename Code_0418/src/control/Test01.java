package control;

/**
 * Created by dllo on 18/4/18.
 */
public class Test01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("A");
                    // 线程自己想要放弃掉CPU的资源
                    // 但是具体是否CPU就放弃它了
                    // 还是CPU说的算
                    Thread.yield();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("B");
                    Thread.yield();
                }
            }
        }).start();
    }
}
