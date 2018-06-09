/**
 * Created by dllo on 18/3/30.
 */
public class Test08 {
    public static void main(String[] args) {
        //  循环嵌套
        //  99乘法表
        //  99 多敲几次
        for (int i=1;i<10;i++){   //控制第一个数
            for (int j=1;j<=i;j++){     //控制第二个数
                System.out.print(j + "*" + i + "=" + i * j+"\t");
            }
            System.out.println();     //换行
        }
    }
}
