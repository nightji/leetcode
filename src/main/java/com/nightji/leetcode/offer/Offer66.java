package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

public class Offer66 {

    public static void main(String[] args) {
        Offer66 offer66 = new Offer66();
        int[] a = {1, 2, 3, 4, 5};
        ArrayUtil.printArray(offer66.constructArr(a));
    }

    public int[] constructArr(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        if (n == 0) {
            return res;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < a.length; i++) {
            left[i] = a[i - 1] * left[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = a[i + 1] * right[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }

}
