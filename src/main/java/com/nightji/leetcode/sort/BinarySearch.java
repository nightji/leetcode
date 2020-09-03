package com.nightji.leetcode.sort;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {0, 1, 1, 2, 3, 3, 4, 5, 6, 6};
        System.out.println(binarySearch.search(nums, 2));
    }

    public int search(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else if (array[mid] < target) {
                left = mid + 1;
            }
        }
        return 0;
    }

    public int searchLeftTarget(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {

        }

        return 0;
    }

    public int searchRightTarget(int[] array, int target) {
        return 0;
    }


}
