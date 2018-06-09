import java.util.Scanner;

/**
 * Created by dllo on 18/3/28.
 */
public class Test08 {
    public static void main(String[] args) {
        // if 的 第一种写法
        // if(条件){满足条件时的代码}
        // 输入一个数 ,输出他的绝对值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();

        if (num < 0) {
            num *= -1;  // num = num * -1
        }
        System.out.println("绝对值是:" + num);
    }
}
