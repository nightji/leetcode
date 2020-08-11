package com.nightji.leetcode;

public class LeetCode121 {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        LeetCode121 leetCode121 = new LeetCode121();
        System.out.println(leetCode121.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(price - minPrice, maxProfit);
        }
        return maxProfit;
    }

}
