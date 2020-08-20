package com.nightji.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode215 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        System.out.println(new LeetCode215().findKthLargest3(nums, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            maxHeap.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        return maxHeap.peek();
    }

    public int findKthLargest3(int[] nums, int k) {
        buildMaxHeap(nums, k);
        for (int i = k; i < nums.length; i++) {
            if (nums[i] < nums[0]) {
                continue;
            }
            nums[0] = nums[i];
            shiftDown(nums, 0, k);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] nums, int k) {
        for (int i = k / 2 - 1; i >= 0; i--) {
            shiftDown(nums, i, k);
        }
    }

    public void shiftDown(int[] nums, int i, int len) {
        int minIndex = i;
        while (true) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            if (left < len && nums[left] < nums[minIndex]) {
                minIndex = left;
            }
            if (right < len && nums[right] < nums[minIndex]) {
                minIndex = right;
            }
            if (minIndex == i) {
                break;
            }
            swap(nums, i, minIndex);
            i = minIndex;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
