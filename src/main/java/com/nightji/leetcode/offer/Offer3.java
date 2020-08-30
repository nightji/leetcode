package com.nightji.leetcode.offer;

public class Offer3 {

    public static void main(String[] args) {
        Offer3 offer3 = new Offer3();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(offer3.findRepeatNumber(nums));
    }

    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
