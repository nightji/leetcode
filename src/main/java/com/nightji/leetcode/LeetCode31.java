package com.nightji.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeetCode31 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1};
        LeetCode31 leetCode31 = new LeetCode31();
        leetCode31.nextPermutation(nums);
        leetCode31.printArray(nums);
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void reverse(int[] nums, int start) {
        int j = nums.length - 1;
        int i = start;
        while (i < j) {
            swap(nums, i, j);
            j--;
            i++;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    }

}
