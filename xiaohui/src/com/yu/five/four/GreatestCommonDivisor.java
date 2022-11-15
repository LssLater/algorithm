package com.yu.five.four;

/**
 * 如何求出最大公约数
 *
 * @Author: yy
 * @Date: 2022/1/30 23:41
 * @Version: 1.0.0
 */
public class GreatestCommonDivisor {

    /**
     * 暴力枚举法
     * @param a
     * @param b
     * @return 最大公约数
     */
    public static int getGreatestCommonDivisor1(int a, int b) {
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        if (big % small == 0) {
            return small;
        }
        for (int i = small / 2; i > 1; i--) {
            if (small % i == 0 && big % i == 0) {
                return i;
            }
        }
        return 1;
    }

    /**
     * 辗转相除法
     * @param a
     * @param b
     * @return
     */
    public static int getGreatestCommonDivisor2(int a, int b) {
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        if (big % small == 0){
            return small;
        }
        return getGreatestCommonDivisor2(big%small,small);
    }

        public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor2(25, 5));
        System.out.println(getGreatestCommonDivisor2(100, 80));
        System.out.println(getGreatestCommonDivisor2(27, 14));

    }
}
