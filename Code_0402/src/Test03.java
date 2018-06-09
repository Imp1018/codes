/**
 * Created by dllo on 18/4/2.
 */
public class Test03 {
    public static void main(String[] args) {
        // 定义数组的第二种方式
       int[] arr = new int[10];     //  定义了一个 可以容纳10个元素的数组
        // 记住: 数组在使用时 当赋值完成后
        // 他的长度就是确定的并且不能改变
        // 在定义数组是,中括号内的数字代表 元素个数
        // 一定不要认为是元素 下标的最大值
        // int的默认值就是0
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
       }
        System.out.println("---------------");
        int[]arr1=new int[100];
        // int 的值默认就是0
        arr[0]=0;
        // 把0-99 按顺序放入arr中
        //  输出 整个数组
        for (int i = 0; i < 100; i++) {
             arr[i]=i;
            System.out.println(i);
        }

    }


}
