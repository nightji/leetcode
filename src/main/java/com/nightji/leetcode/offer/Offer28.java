package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.TreeNode;

public class Offer28 {

    public static void main(String[] args) {
        Offer28 offer28 = new Offer28();
        TreeNode root = new TreeNode(1);
        System.out.println(offer28.isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recur(root.left, root.right);
    }

    public boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return recur(left.left, right.right) && recur(left.right, right.left);
    }

}
