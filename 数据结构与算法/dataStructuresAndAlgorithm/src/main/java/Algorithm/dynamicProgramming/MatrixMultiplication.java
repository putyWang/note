package Algorithm.dynamicProgramming;

/**
 * 矩阵乘法的顺序安排
 */
public class MatrixMultiplication {

    /**
     * @param c 矩阵列数数组
     * @param m 矩阵i到j矩阵段所需的乘法次数
     * @param lastChange 坐标 i j 处最新更新矩阵数组索引
     */
    public static void optMatrix(int[] c, long[][] m, int[][] lastChange) {

        int n = c.length - 1;

        //初始化统一矩阵之间的乘法次数为0
        for (int i = 0; i < n; i ++) {
            m[i][i] = 0;
        }

        //循环计算不同长度乘法所需的最优次数
        for (int i = 0; i < n; i ++) {

            for (int left = 0; left < n - i; left ++) {
                //初始化m[left][right]为最大数
                int right = left + i;
                m[left][right] = Long.MAX_VALUE;

                //选取不同的括号分割点的位置进行计算
                for (int k = left; k <right; k ++) {
                    //计算该条件下所需的乘法次数
                    Long thisCost = m[left][k] + m[k + 1][right] + (long) c[left - 1] * c[k] * c[right];

                    //比较已经存在的与当前乘法次数比较，取小
                    if (thisCost < m[left][right]) {
                        m[left][right] = thisCost;

                        lastChange[left][right] = k;
                    }
                }
            }
        }

    }
}
