package com.nightji.leetcode;

import com.nightji.leetcode.basic.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode106 {

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(map, inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTree(Map<Integer, Integer> map, int[] inorder, int inLeft, int inRight,
                              int[] postorder, int postLeft, int postRight) {
        if (inLeft > inRight || postLeft > postRight) {
            return null;
        }
        int pivot = postorder[postRight];
        int pivotIndex = map.get(pivot);
        int leftTreeNum = pivotIndex - inLeft;
        TreeNode root = new TreeNode(pivot);
        root.left = buildTree(map, inorder, inLeft, pivotIndex - 1, postorder, postLeft, postLeft + leftTreeNum - 1);
        root.right = buildTree(map, inorder, pivotIndex + 1, inRight, postorder, postLeft + leftTreeNum, postRight - 1);
        return root;
    }

}
