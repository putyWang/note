package Algorithm.plainTest;

import java.util.Random;

/**
 * 属性测试工具类
 */
public class PlainTestUtil {

    /**
     * 默认验证次数
     */
    private static final int TRIALS = 5;

    /**
     * p是否为素数
     * @param p 验证的数
     * @return
     */
    public static boolean isPrime (Long p) {
        //设置随机生成器
        Random r = new Random();

        //取不同随机数验证多次
        for (int i = 0; i < TRIALS; i ++) {

            if (witness(r.nextLong() + 2, p - 1, p) != 1) {
                return false;
            }
        }

        return true;
    }

    /**
     * 素性测试递归方法
     * @param a 费马小定理测试A
     * @param x 定理二 测试X
     * @param p 被测试数
     * @return
     */
    private static Long witness (Long a, Long x, Long p) {

        //当X等于0时，直接返回
        if (x == 0) {
            return 1L;
        }

        //使用递归计算x
        Long X = witness (a, x / 2, p);
        if (X == 0) {
            return 0L;
        }

        //计算x^2(mod p)
        long y = (X * X) % p;

        //确定x是否满足定理二
        if (y == 1 && X != 1 && X != p - 1) {
            return 0L;
        }

        //该数成立后，取下一个数
        if (x % 2 != 0) {
            y = (a * y) % p;
        }

        return y;
    }
}
