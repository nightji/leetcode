package com.nightji.leetcode.offer;

public class Offer11 {

    public static void main(String[] args) {
        Offer11 offer11 = new Offer11();
        int[] nums = {3,4,5,1,2};
        System.out.println(offer11.minArray(nums));
    }

    public int minArray(int[] numbers) {
        int len = numbers.length;
        if (len == 0) {
            return 0;
        }
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] == numbers[right]) {
                right -= 1;
            } else {
                right = mid - 1;
            }
        }
        return numbers[left];
    }

}
