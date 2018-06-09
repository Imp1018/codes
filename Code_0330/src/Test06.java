/**
 * Created by dllo on 18/3/30.
 */
public class Test06 {
    public static void main(String[] args) {
        // 打印 1-100 中 所有的奇数
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
