package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

public class Offer21 {

    public static void main(String[] args) {
        Offer21 offer21 = new Offer21();
        int[] nums = {1, 2, 3, 4};
        offer21.exchange(nums);
        ArrayUtil.printArray(nums);
    }

    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] % 2 == 1) {
                i++;
            }
            while (i < j && nums[j] % 2 == 0) {
                j--;
            }
            swap(nums, i, j);
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
