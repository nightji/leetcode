package com.nightji.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        LeetCode46 leetCode46 = new LeetCode46();
        List<List<Integer>> lists = leetCode46.permute(nums);
        System.out.println(lists);
    }

    public List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (length < 1) {
            return res;
        }
        List<Integer> path = new ArrayList<>(length);
        boolean[] used = new boolean[length];
        dfs(nums, length, 0, path, res, used);
        return res;
    }

    public void dfs(int nums[], int length, int depth,
                    List<Integer> path, List<List<Integer>> res, boolean[] used) {
        if (length == depth) {
            res.add(new ArrayList<>(path));
        }
        for(int i = 0; i < length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, length, depth + 1, path, res, used);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }


}
