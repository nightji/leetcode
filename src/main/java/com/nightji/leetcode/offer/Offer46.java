package com.nightji.leetcode.offer;

public class Offer46 {

    public static void main(String[] args) {
        Offer46 offer46 = new Offer46();
        System.out.println(offer46.translateNum(12258));
    }

    public int translateNum(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (isStringLegal(s.substring(i - 2, i))) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[n];
    }

    public boolean isStringLegal(String s) {
        int num = Integer.parseInt(s);
        if (num >= 10 && num <= 25) {
            return true;
        }
        return false;
    }

}
