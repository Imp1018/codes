import java.util.Scanner;

/**
 * Created by dllo on 18/3/29.
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字");
        int day = scanner.nextInt();
        /*
           switch-case 使用
           1.switch 小括号内必须是一个确定的值(数字,字符,boolean)
           2.大括号内由case-default 组成
           3.case后确定的值 程序运行时 会自动比较case的值 和switch小括号内的值是否相等
           如果相等,则执行case后的代码 直到break为止
           4.默认情况下,每一个case后都会写上break
           5.break 使用在switch-case中 当程序运行到break的时候
             会无条件结束整个switch
           6.default 当所有case 都没有匹配上的时候
             就会匹配到default,default是可以不写的
        */
        switch (day){
            case 1:     //case不能是逻辑表达式
                System.out.println("星期一");
                break;  //结束整个switch-case
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default://默认
                System.out.println("数据异常");

        }
    }
}
