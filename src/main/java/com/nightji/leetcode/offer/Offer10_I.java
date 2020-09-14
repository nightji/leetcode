package com.nightji.leetcode.offer;

public class Offer10_I {

    public static void main(String[] args) {
        Offer10_I offer10_i = new Offer10_I();
        System.out.println(offer10_i.fib3(10));
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fib2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n] % 1000000007;
    }

    public int fib3(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 0, second = 1, sum = 0;
        while (n > 1) {
            sum = first + second;
            first = second;
            second = sum;
            n--;
        }
        return sum % 1000000007;
    }

}
