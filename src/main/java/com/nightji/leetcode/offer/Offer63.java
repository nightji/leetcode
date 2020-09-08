package com.nightji.leetcode.offer;

public class Offer63 {

    public static void main(String[] args) {
        Offer63 offer63 = new Offer63();
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(offer63.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0, cost = Integer.MAX_VALUE;
        for (int price : prices) {
            cost = Math.min(cost, price);
            maxProfit = Math.max(maxProfit, price - cost);
        }
        return maxProfit;
    }

}
