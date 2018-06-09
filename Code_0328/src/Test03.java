import java.util.Scanner;

/**
 * Created by dllo on 18/3/28.
 */
public class Test03 {
    public static void main(String[] args) {
        //操作符
        // + - * / %(取余,膜)
        //+= -= /= %=
        //++ --
        int a = 3;
        int b = 5;

        int sum = a + b;       //求和
        int sub = a - b;       //求差
        int product = a * b;   //求积
        int consult = a / b;   //求商  会抛弃掉结果的小数位,直接取整(没有四舍五入)
        //整数相除 结果只能是整数
        //如果是浮点数相除 则结果将会是精确结果(浮点数)
        //实际开发中 绝大多数是整数进行运算

        //输出 sum.sout sub.sout
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(product);
        System.out.println(consult);


        //(数据类型)  叫做强制类型转换
        //可以将(类型)后跟随的值,类型强制转换为括号内的类型
        //这种转换,并不能保证精度,即数据有可能丢失
        //例如: 浮点数 转换成 整数, 小数位就永久消失了
        int c = (int) 3.14;
        System.out.println(c);

        // 求商 要求 保留整数位,结果是四舍五入的结果
        //例如 3/2=2
        Scanner scanner = new Scanner(System.in);
        System.out .println("被除数:");
        int num1 = scanner.nextInt();
        System.out.println("除数:");
        int num2= scanner.nextInt();
        //整数之间做加减乘除,结果都是整数
        //整数 于 浮点数 加减乘除,结果是浮点数
        int result = (int) (num1*1f/num2+0.5f);   //*1f是为了变成浮点数 +0.5f为了四舍五入
        System.out.println("商是:"+result);



    }
}
