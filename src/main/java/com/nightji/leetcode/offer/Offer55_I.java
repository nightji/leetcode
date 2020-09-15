package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Offer55_I {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        int depth = 0;
        if (root == null) {
            return depth;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            depth++;
        }
        return depth;
    }

    public int maxDepth2(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

}
