package com.nightji.leetcode.offer;

public class Offer33 {

    public static void main(String[] args) {
        Offer33 offer33 = new Offer33();
        int[] nums = {1, 6, 3, 2, 5};
        System.out.println(offer33.verifyPostorder(nums));
    }

    public boolean verifyPostorder(int[] postorder) {
        return helper(postorder, 0, postorder.length - 1);
    }

    public boolean helper(int[] postorder, int left, int right) {
        if (left >= right) {
            return true;
        }
        int root = postorder[right];
        int index = left;
        while (postorder[index] < root) {
            index++;
        }
        int temp = index;
        while (temp < right) {
            if (postorder[temp++] < root) {
                return false;
            }
        }
        return helper(postorder, left, index - 1) && helper(postorder, index, right);

    }

}
