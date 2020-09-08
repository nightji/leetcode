package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Offer37 {

    public static void main(String[] args) {

    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        StringBuilder res = new StringBuilder();
        res.append("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode != null) {
                res.append(treeNode.val).append(",");
                queue.add(treeNode.left);
                queue.add(treeNode.right);
            } else {
                res.append("null,");
            }
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]")) {
            return null;
        }
        String[] values = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (!values[i].equals("null")) {
                treeNode.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(treeNode.left);
            }
            i++;
            if (!values[i].equals("null")) {
                treeNode.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(treeNode.right);
            }
            i++;
        }
        return root;
    }

}
