import java.util.Scanner;

/**
 * Created by dllo on 18/3/28.
 */
public class Test09 {
    public static void main(String[] args) {
        //if 的第二种形式
        // 接受用户输入的年龄
        // 如果0-130,输出是人类
        // 否则,输出不是人类

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 130) {
            System.out.println("是人类");
        } else {
            /*if 的第二种形式:
            if (条件){
            代码一
            }else{
            代码二
            }

            else 表示 否则
            如果 条件成立,执行代码一
            如果 条件不成立,执行代码二
            即: 代码一和代码二 有 且只有一个 会执行
            */

            System.out.println("不是人类");
        }
    }
}
