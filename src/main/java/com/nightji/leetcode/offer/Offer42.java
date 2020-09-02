package com.nightji.leetcode.offer;

public class Offer42 {

    public static void main(String[] args) {
        Offer42 offer42 = new Offer42();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(offer42.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

}
