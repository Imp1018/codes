import java.util.Scanner;

/**
 * Created by dllo on 18/3/28.
 */
public class Test10 {
    public static void main(String[] args) {
        // 接受用户输入的两个数
        // 输出最大值:  最小值:
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int num1 = scanner.nextInt();

        if (num>=num1){
            System.out.println("最大值是:"+num);
            System.out.println("最小值是:"+num1);
        }else {
            System.out.println("最大值是:"+num1);
            System.out.println("最小值是:"+num);
        }
    }
}
