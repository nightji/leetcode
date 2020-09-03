package com.nightji.leetcode.basic;

public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public void inOrder(TreeNode tree) {
        if (tree == null) {
            return;
        }
        inOrder(tree.left);
        System.out.println(tree.val);
        inOrder(tree.right);
    }

    public void preOrder(TreeNode tree) {
        if (tree == null) {
            return;
        }
        System.out.println(tree.val);
        inOrder(tree.left);
        inOrder(tree.right);
    }

    public void afterOrder(TreeNode tree) {
        if (tree == null) {
            return;
        }
        inOrder(tree.left);
        inOrder(tree.right);
        System.out.println(tree.val);
    }

}
