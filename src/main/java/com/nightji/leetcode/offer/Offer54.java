package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.TreeNode;

public class Offer54 {

    public static void main(String[] args) {

    }

    int res;

    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        k--;
        if (k == 0) {
            res = root.val;
            return;
        }
        dfs(root.left);
    }

}
