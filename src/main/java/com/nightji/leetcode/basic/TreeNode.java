package com.nightji.leetcode.basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        inOrder(root.left);
        inOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.val);
    }

    public void preOrder2(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    public void inOrder2(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<> ();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }

    public void postOrder2(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<TreeNode> res = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            res.push(node);
            stack.pop();
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        while(!res.isEmpty()) {
            System.out.println(res.pop().val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        /*root.inOrder(root);
        root.inOrder2(root);
        root.preOrder(root);
        root.preOrder2(root);*/
        root.postOrder(root);
        root.postOrder2(root);
    }


}
