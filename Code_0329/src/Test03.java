import java.util.Scanner;

/**
 * Created by dllo on 18/3/29.
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入1-12 输出这个与 是大是小
        //1 3 5 7 8 10 12
        //4 6 9 11
        //2 特殊
        // 输入其他数字 输出 数据异常
        System.out.println("请输入月份");
        int mon = scanner.nextInt();
        switch (mon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("大");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("小");
                break;
            case 2:
                System.out.println("特殊");
                break;
            default:
                System.out.println("数据异常");

        }
    }
}
