import java.util.Scanner;

/**
 * Created by dllo on 18/3/29.
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数");
        int c = scanner.nextInt();

        int max = a;    //max 最大值
        //if (b > max) {
        //    max = b;
        //}
        max = max > b ? max : b;
        max = max > c ? max : c;


        //   ?  : 叫做三目运算符
        // 之前的运算符 如 +  使用的是 : 左边 + 右边
        //  逻辑表达式?值1:值2
        //  整个三目运算符会计算得出一个结果
        //  这个结果 要么是值1 要么是值2
        //  如果逻辑表达式是true 结果是值1
        //  如果逻辑表达式是false 结果是值2
        //  三目运算符可以完全由if代替
        //  作用 1: 缩减代码行数
        //      2: 提升B格
        //if (c > max) {
        //    max = c;
        //}
        System.out.println("最大值是:" + max);

        int min = a;
        min = min < b ? min : b;
        min = min < c ? min : c;
        //if (b < min) {
        //    min = b;
        //}
        //if (c < min) {
        //    min = c;
        //}
        System.out.println("最小值是:" + min);
    }
}
