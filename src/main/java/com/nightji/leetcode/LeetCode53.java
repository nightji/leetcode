package com.nightji.leetcode;

public class LeetCode53 {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1};
        LeetCode53 leetCode53 = new LeetCode53();
        System.out.println(leetCode53.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else{
                sum = nums[i];
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }

}
