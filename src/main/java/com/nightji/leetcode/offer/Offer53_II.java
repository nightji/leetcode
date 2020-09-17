package com.nightji.leetcode.offer;

public class Offer53_II {

    public static void main(String[] args) {
        Offer53_II offer53 = new Offer53_II();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(offer53.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
