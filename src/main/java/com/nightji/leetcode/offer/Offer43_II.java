package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Offer43_II {

    public static void main(String[] args) {
        Offer43_II offer43II = new Offer43_II();

    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, sum, path, res);
        return res;
    }

    public void dfs(TreeNode treeNode, int sum, List<Integer> path, List<List<Integer>> res) {
        if (treeNode == null) {
            return;
        }
        path.add(treeNode.val);
        if (treeNode.left == null && treeNode.right == null) {
            if (treeNode.val == sum) {
                res.add(new ArrayList<>(path));
            }
        }
        dfs(treeNode.left, sum - treeNode.val, path, res);
        dfs(treeNode.right, sum - treeNode.val, path, res);
        path.remove(path.size() - 1);
    }




}
