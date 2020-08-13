package com.nightji.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode47 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        LeetCode47 leetCode47 = new LeetCode47();
        List<List<Integer>> lists = leetCode47.permuteUnique(nums);
        System.out.println(lists);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (length < 1) {
            return res;
        }
        List<Integer> path = new ArrayList<>(length);
        boolean[] used = new boolean[length];
        dfs(nums, length, 0, path, res, used);
        return res;
    }

    public void dfs(int[] nums, int length, int depth,
                    List<Integer> path, List<List<Integer>> res, boolean[] used) {
        if (depth ==  length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            dfs(nums, length, depth + 1, path, res, used);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
