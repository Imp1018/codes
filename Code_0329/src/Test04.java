import java.util.Scanner;

/**
 * Created by dllo on 18/3/29.
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个三位数");
        int num = scanner.nextInt();
        int raw =num;
        int hun = num / 100;   //百位
        num %= 100;
        int ten = num / 10;    //十位
        num %= 10;             //个位
        if (raw==hun*hun*hun+ten*ten*ten+num*num*num){
            System.out.println("是水仙花数");
        }else{
            System.out.println("不是水仙花数");
        }

    }
}
