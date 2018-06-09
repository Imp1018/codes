package control;

import java.util.concurrent.RecursiveTask;

/**
 *
 */

public class SumTask extends RecursiveTask<Long> {

    private Long target;
    private Long from;
    // 阈值 如果from和target的差 > 该值,则 拆分任务
    private static final long THRESHOLD = 10000L;

    public SumTask(Long from, Long target) {
        this.target = target;
        this.from = from;
    }

    @Override
    protected Long compute() {
        if (target - from <= THRESHOLD) {
            // 任务已经足够小了,自己计算完成 即可
            long sum = 0L;
            for (long i = from; i <= target; i++) {
                sum += i;
            }
            return sum;
        }
        // 任务还是很大,需要拆分
        // 计算前一半的值
        long mid = (target + from) / 2;
        SumTask sumTask1 = new SumTask(from,
                mid);
        // 计算后一半的值
        SumTask sumTask2 = new SumTask(mid + 1,
                target);
        // 相当于 线程.start();
        invokeAll(sumTask1, sumTask2);// 关键代码
//        sumTask1.fork();
//        sumTask2.fork();

        return sumTask1.join() + sumTask2.join();
    }
}