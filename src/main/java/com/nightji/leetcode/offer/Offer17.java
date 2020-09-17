package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

public class Offer17 {

    public static void main(String[] args) {
        Offer17 offer17 = new Offer17();
        ArrayUtil.printArray(offer17.printNumbers(2));
    }

    public int[] printNumbers(int n) {
        int max = (int)Math.pow(10, n);
        int[] res = new int[max - 1];
        for (int i = 1; i < max; i++) {
            res[i - 1] = i;
        }
        return res;
    }

}
