package com.nightji.leetcode.offer;

public class Offer10 {

    public static void main(String[] args) {
        Offer10 offer10 = new Offer10();
        System.out.println(offer10.numWays(0));
    }

    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n;i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }

}
