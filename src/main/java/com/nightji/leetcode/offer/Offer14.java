package com.nightji.leetcode.offer;

public class Offer14 {

    public static void main(String[] args) {
        Offer14 offer14 = new Offer14();
        System.out.println(offer14.cuttingRope(10));
    }

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }

}
