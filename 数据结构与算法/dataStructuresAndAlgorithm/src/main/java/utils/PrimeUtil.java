package utils;

/**
 * 素数工具类
 */
public class PrimeUtil {

    private PrimeUtil(){}

    /**
     * 获取本数下一个素数
     * @param prime
     * @return
     */
    public static int nextPrime (int prime) {

        while (true) {
            while (isPrime(prime)) {
                return prime;
            }

            prime ++;
        }
    }

    private static boolean isPrime (int prime) {

        int end = prime;
        int start = 2;
        while (end > start) {

            if ( prime % start == 0) {

                return false;
            }

            end = prime / start;
            start ++;
        }

        return true;
    }
}
