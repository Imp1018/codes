/**
 * Created by dllo on 18/3/30.
 */
public class Test05 {
    public static void main(String[] args) {
        //   break 和 continue
        //   在循环内部 对循环进行控制的
        //
        //
        //
        // 当程序 执行break的时候
        // 会无条件终止当前循环
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
            System.out.println("+++++");
        }
        // continue 跳过当前这一次循环
        for (int i = 0; i < 10; i++) {
            if(1==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
