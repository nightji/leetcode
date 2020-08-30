package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

public class Offer56 {

    public static void main(String[] args) {
        int[] nums = {1,2,10,4,1,4,3,3};
        Offer56 offer56 = new Offer56();
        ArrayUtil.printArray(offer56.singleNumbers(nums));
    }

    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int mask = 0;
        for (int num : nums) {
            mask = mask ^ num;
        }
        int lowBit = mask & (-mask);
        for (int num : nums) {
            if ((num & lowBit) == 0) {
                res[0] = res[0] ^ num;
            } else {
                res[1] =  res[1] ^ num;
            }
        }
        return res;
    }

}
