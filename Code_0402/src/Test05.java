/**
 * Created by dllo on 18/4/2.
 */
public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4};
        // 从小到大排序
        /*
        * 冒泡排序
        * 核心思想: 保证 数组中 右边的数 >= 左边的数
        * 如果要是右边的比左边的小  就 交换这两个数
        *
        *
        *
        * */
        // // TODO: 18/4/2  给弄明白了
        for (int i1 = 0; i1 < arr.length - 1; i1++) {
            //  这个循环 循环5次
            for (int i = 0; i < arr.length - 1 - i1; i++) {
                //  每一次循环
                //  保证 右边的数比左边的数大
                if (arr[i + 1] < arr[i]) {
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }

            }

        }      //  输出整个数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
