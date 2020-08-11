package com.nightji.leetcode;

public class LeetCode4 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{2};
        LeetCode4 leetCode4 = new LeetCode4();
        System.out.println(leetCode4.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] array = mergeTwoArray(nums1, nums2);
        int length = array.length;
        if (length % 2 == 0) {
            return (array[(length>>1) - 1] + array[length>>1]) / 2.0;
        } else {
            return array[length>>1];
        }


    }

    public int[] mergeTwoArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] array = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (true){
            if (i == m) {
                while (j < n) {
                    array[k++] = nums2[j++];
                }
                break;

            }
            if (j == n) {
                while (i < m) {
                    array[k++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                array[k++] = nums1[i++];
            } else {
                array[k++] = nums2[j++];
            }
        }
        return array;
    }

}
