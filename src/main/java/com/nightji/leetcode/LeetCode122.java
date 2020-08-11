package com.nightji.leetcode;

public class LeetCode122 {

    public static void main(String[] args) {
        int[] prices = new int[]{};
        LeetCode122 leetCode122 = new LeetCode122();
        System.out.println(leetCode122.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

}
