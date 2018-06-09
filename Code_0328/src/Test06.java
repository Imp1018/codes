/**
 * Created by dllo on 18/3/28.
 */
public class Test06 {
    public static void main(String[] args) {
        //++ -- 操作符
        // 自增或自减 1
        int i = 1;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i++;
        System.out.println(i);

        // 以后再写代码的时候,  ++  -- 操作符,最好单独写一行
        // 及时你把他的运行顺序搞懂了
        // 因为读你代码的人不一定懂
        i = 1;
        int a = 3 + i++;
        System.out.println(i);       //i++;先不进行自加
        System.out.println(a);       //++i;先进行自加


    }
}
