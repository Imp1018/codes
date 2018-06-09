import java.util.Scanner;

/**
 * Created by dllo on 18/3/30.
 */
public class Test01 {
    public static void main(String[] args) {
        // 输入两个数 计算出 和 输出
        // 这个循环特点  写代码的时候也不知道要循环多久
        // 所以 for 的 表达式1 和 表达式3 啥也不写
        // 通常这种循环我们使用 while
        Scanner scanner = new Scanner(System.in);
        /*  while语法:
        *    while(表达式){
        *        代码
        *    }
        *   1. 小括号内的表达式一定能最后计算出 true / false 的结果
        *   2. 如果小括号内位 true 则一直循环
        *   3. 执行顺序: 表达式 => 代码 => 表达式 => 代码 => 表达式 => 代码 =>.....
        *    和位100 退出循环
        *    只要和不为100 就一直运行下去
        */
        // 代码生活中如何选择for和while
        // 如果确定要循环多少次 选择 for
        // 如果不确定要循环多少次 选择 while
        int sum = 0;
        while (sum != 100) {
            System.out.println("第一个数:");
            int a = scanner.nextInt();
            System.out.println("第二个数:");
            int b = scanner.nextInt();
            sum = a + b;
            System.out.println("和是:" + sum);
        }


    }
}
