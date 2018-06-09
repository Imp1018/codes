/**
 * Created by dllo on 18/3/29.
 */
public class Test05 {
    public static void main(String[] args) {
        //循环结构1
        //从0一直到99 把这100个数字打印出来
        //for循环
        //语法结构:
        //for(表达式1;表达式2;表达式3){
        // 代码块
        // }
        //0.代码块里的代码可以很复杂 什么都可以写
        //1. 表达式1:
        //  表达式1,是循环的初始条件,是整个for循环最先执行的部分,并且只会执行一次
        //2. 表达式2:
        //  表达式2,是循环的条件,无论表达式2多么复杂,最后一定能计算出确定的boolean值(true/false)
        //  如果为true 则循环继续 如果为false 则循环结束
        //3. 表达式3:
        //  表达式3,是每一次循环执行的代码
        //4. for循环执行的顺序
        //  表达式1>=表达式2>=代码块>=表达式3
        // >=表达式2>=代码块>=表达式3
        // >=表达式2>=代码块>=表达式3
        // >=........

        for (int i = 1; i < 100; i++) {
            if (i % 10 == 7) {
                //个位是7
                System.out.println("*");
            } else if (i / 10 == 7) {
                System.out.println("*");
            } else if (i % 7 == 0) {
                System.out.println("*");
            } else {
                System.out.println(i);
            }
        }
    }
}
