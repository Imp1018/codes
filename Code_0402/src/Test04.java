import java.util.Random;

/**
 * Created by dllo on 18/4/2.
 */
public class Test04 {
    public static void main(String[] args) {
        // 定义一个10个元素的数组
        // 生成10个随机数 放入这个数组
        // 输出这个数组
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int a = random.nextInt(20);
            arr[i] = a;
            System.out.println(arr[i]);
        }
        System.out.println("--------------");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
        System.out.println("------------");
        int min = 20;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
