import java.util.Scanner;

/**
 * Created by dllo on 18/3/28.
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");

        //接收输入
        //一定要使用代码提示 选择(java.util)
        // scanner 的作用是来检测键盘的输入
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println("用户输入了:" + num);


        System.out.println("请输入第二个数字:");
        int num2 = scanner.nextInt();
        System.out.println("用户输入的第二个数字是:" + num2);

        //输入:
        //1. Scanner scanner = new Scanner(System.in);
        //   这行代码只需要输入一次 就可以一直使用
        //2. 要想给用户输入一个提示 需要自己写System.out.println("提示信息")
        //3. 每一次想要接受输入都需要写
        //      scanner.nextInt() 然后把它赋值给一个int 类型的变量
        //4. 如果用户输入的不是整数或范围超出了int的范围
        //      那么程序就会在控制台报错

        System.out.println("输入第一个字符");//提示信息
        int a = scanner.nextInt();  //接受用户输入 存在a中
        System.out.println("输入第二个字符");//提示信息
        int b = scanner.nextInt();  //接受用户输入 存在b中
        System.out.println("a:" + a + ",b" + b);  //a,b一起输出

    }
}
