package com.nightji.leetcode.offer;

import java.util.HashSet;
import java.util.Set;

public class Offer61 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 5};
        Offer61 offer61 = new Offer61();
        System.out.println(offer61.isStraight(nums));
    }

    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxValue = 0, minValue = 14;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (set.contains(num)) {
                return false;
            } else {
                set.add(num);
            }
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }
        return (maxValue - minValue) < 5;
    }

}
