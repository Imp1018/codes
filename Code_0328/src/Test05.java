/**
 * Created by dllo on 18/3/28.
 */
public class Test05 {
    public static void main(String[] args) {
        int a = 3;
        a = a + 4;
        System.out.println(a);

        a += 4;   //a += 4 相当于 a = a + 4;
        System.out.println(a);
        //+=,-=,*=,/=,%= 这些操作符
        // 在代码的执行速度中要略优于 +,-,*,/,%;

    }
}
