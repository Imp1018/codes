package control;

import control.SumTask;

import java.util.concurrent.ForkJoinPool;

/**
 *
 */

public class Test03 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        addWithJoin(500000000L);
        long mid = System.currentTimeMillis();


        System.out.println("消耗时间:" + (mid - start) + "ms");
        addWithNormal(500000000L);
        long end = System.currentTimeMillis();
        System.out.println("-->" + (end - mid) + "ms");

    }

    public static void addWithNormal(long target) {
        long sum = 0;
        for (long i = 0; i <= target; i++) {
            sum += i;
        }
        System.out.println("Normal:" + sum);
    }

    public static void addWithJoin(long target) {

        SumTask task = new SumTask(0L, target);
        // 专门用来启动Task的
        ForkJoinPool fjp = new ForkJoinPool(4);
        Long result = fjp.invoke(task);// 启动任务,并得到结果

        System.out.println("结果是:" + result);
    }
}
