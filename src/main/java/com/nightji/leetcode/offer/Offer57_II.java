package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

public class Offer57_II {

    public static void main(String[] args) {
        Offer57_II offer57II = new Offer57_II();
        ArrayUtil.printArray(offer57II.findContinuousSequence(9));
    }

    public int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();
        while (i <= target / 2) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] array = new int[j - i];
                for (int k = i; k < j; k++) {
                    array[k-i] = k;
                }
                res.add(array);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[0][]);
    }

}
