import java.util.Random;
import java.util.Scanner;

/**
 * Created by dllo on 18/3/30.
 */
public class Test02 {
    public static void main(String[] args) {
        // 程序运行时 首先随机生成一个 0-100 的整数
        // 然后 让用户猜 是哪个数
        // 每次猜完了告诉用户 猜大了 猜小了  如果正确 退出程序
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(100);//随机生成的数字
        System.out.println("答案是:" + target);
        System.out.println("请输入一个0-100的数字");
        int num = scanner.nextInt();
        while (num != target) {
            if (num > target) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
            System.out.println("请输入一个0-100的数字");
            num = scanner.nextInt();
        }
        System.out.println("猜对了");
    }
}


//        Random random= new Random();   // 用来生成随机数  只写一次
//        int i =random.nextInt(100);  // i 就是0-100的随机数
//        System.out.println(i);
//        System.out.println("数字:");
//        Scanner scanner= new Scanner(System.in);
//



