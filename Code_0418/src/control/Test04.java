package control;

import java.math.BigInteger;

/**
 * 数据溢出的解决方法
 */
public class Test04 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger(String.valueOf(Long.MAX_VALUE));
        bigInteger = bigInteger.add(new BigInteger("1"));
        System.out.println(bigInteger);

    }
}
