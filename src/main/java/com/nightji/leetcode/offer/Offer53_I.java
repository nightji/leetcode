package com.nightji.leetcode.offer;

public class Offer53_I {

    public static void main(String[] args) {
        Offer53_I o = new Offer53_I();
        int[] nums = {5,7,7,8,8,10};
        System.out.println(o.search(nums, 8));
    }

    public int search(int[] nums, int target) {
        int left = searchLeftTarget(nums, target);
        int right = searchRightTarget(nums, target);
        if (left == -1 || right == -1) {
            return 0;
        }
        return right - left + 1;
    }

    public int searchLeftTarget(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else if (array[mid] == target) {
                right = mid - 1;
            }
        }
        if (left >= array.length || array[left] != target) {
            return -1;
        }
        return left;
    }

    public int searchRightTarget(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else if (array[mid] == target) {
                left = mid + 1;
            }
        }

        if (right < 0 || array[right] != target) {
            return -1;
        }
        return right;
    }

}
