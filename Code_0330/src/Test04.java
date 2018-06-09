import java.util.Random;
import java.util.Scanner;

/**
 * Created by dllo on 18/3/30.
 */
public class Test04 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(100);    //随机生成的数字
        System.out.println("答案是:" + target);

        int num = -1;
        do {
            System.out.println("猜一个数:");
            num = scanner.nextInt();      //用户输入一个数
            if (num > target) {
                System.out.println("猜大了");
            } else if (num < target) {
                System.out.println("猜小了");
            }
        } while (num != target);
        System.out.println("猜对了");
    }
}
