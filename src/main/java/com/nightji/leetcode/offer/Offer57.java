package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

public class Offer57 {

    public static void main(String[] args) {
        Offer57 offer57 = new Offer57();
        int[] nums = {10, 26, 30, 31, 47, 60};
        ArrayUtil.printArray(offer57.twoSum(nums, 40));
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{nums[i], nums[j]};
            }
        }
        return new int[2];
    }

}
