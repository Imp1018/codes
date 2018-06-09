import java.util.Scanner;

/**
 * Created by dllo on 18/3/30.
 */
public class Test07 {
    public static void main(String[] args) {
        // 接受用户的输入
        // 输入任意数字
        // 输出 我知道了+数字
        // 输入 -1 程序退出
        System.out.println("任意数字:");
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        while (num!=-1){
            System.out.println("我知道了:"+num);
            num=scanner.nextInt();
        }

    }
}
