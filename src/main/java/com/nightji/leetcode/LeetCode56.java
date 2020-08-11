package com.nightji.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode56 {

    public static void main(String[] args) {
        LeetCode56 leetCode56 = new LeetCode56();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = leetCode56.merge(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

    public int[][] merge(int[][] intervals) {
        int length = intervals.length;
        if (length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> res = new ArrayList<int[]>();
        res.add(intervals[0]);
        for (int i = 1; i < length; i++) {
            int[] curInterval = intervals[i];
            int[] peek = res.get(res.size() - 1);
            if (curInterval[0] > peek[1]) {
                res.add(curInterval);
            } else {
                peek[1] = Math.max(peek[1], curInterval[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }


}
