package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Offer7 {

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(map, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(Map<Integer, Integer> map, int[] preorder, int preLeft, int preRight,
                              int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int pivot = preorder[preLeft];
        TreeNode root = new TreeNode(pivot);
        int pivotIndex = map.get(pivot);
        int leftTreeNum = pivotIndex - inLeft;
        root.left = buildTree(map, preorder, preLeft + 1, preLeft + leftTreeNum, inorder, inLeft, pivotIndex - 1);
        root.right = buildTree(map, preorder, preLeft + leftTreeNum + 1, preRight, inorder, pivotIndex + 1, inRight);
        return root;
    }

}
