/**
 * Created by dllo on 18/4/2.
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        // 要把 数组中所有的元素  倒序输出
        // 所有数组的题 大多数都是在玩下标
        // 如果 i--
        // 退出的条件 就应该 给 i 一个下限

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            // int i= arr.length-1

        }
        System.out.println("-----------------------");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
