/**
 * Created by dllo on 18/3/28.
 */
public class Test04 {
    //取余(求模)
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = a % b;
        System.out.println(c);

        //有189元
        //求:最少使用多少张纸币可以凑成189元
        int money = 189;  //共189
        int money100 = money / 100;//求出了189要几张100
        money = money % 100;
        int money50 = money / 50;
        money = money % 50;
        int money20 = money / 20;
        money = money % 20;
        int money10 = money / 10;
        money = money % 10;      //money %= 10
        int money5 = money / 5;
        money = money % 5;
        System.out.println("189元最少由:" +
                +money100 + "张100元,"
                + money50 + "张50元,"
                + money20 + "张20,"
                + money10 + "张10元,"
                + money5 + "张5元,"
                + money + "张1元 组成");
    }
}
