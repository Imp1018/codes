import java.util.Scanner;

/**
 * Created by dllo on 18/3/28.
 */
public class Test02 {
    //接受用户输入的两个数
    //分别给a,b 两个变量赋值
    //输出:a:值 b:值
    //接着输入:交换后:a:值,b:值
    //例如 用户输入了:3,5
    //输出:
    //    a:3,b:5
    //    交换后:a:5,
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int a = scanner.nextInt();

        System.out.println("请输入第二个数");
        int b = scanner.nextInt();

        System.out.println("a:" + a + ",b:" + b);
        //接着输入:交换后:  a:值,b:值

        //1. 再来一个盒子
        int c;   //int c = 0; // c 的值无关紧要,可以不写 默认值是0
        //变量c的值 现在是变量a的值
        c = a;  //把a的值复制一份给c,a的值不变
        a = b;  //把b的值复制一份给a,
        b = c;  //把c的值复制一份给b.

        System.out.println("交换后:a:" + a + ",b:" + b);
        System.out.println("c:" + c);
    }
}
