package com.nightji.leetcode.offer;

public class Offer39 {

    public static void main(String[] args) {
        Offer39 offer39 = new Offer39();
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(offer39.majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        int res = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) {
                res = num;
            }
            if (num == res) {
                votes++;
            } else {
                votes--;
            }
        }
        int count = 0;
        for (int num : nums) {
            if (num == res) {
                count++;
            }
        }
        return count > nums.length / 2 ? res : 0;
    }

}
