package com.nightji.leetcode;


public class LeetCode42 {

    public static void main(String[] args) {
        int[] height = new int[]{5,5,1,7,1,1,5,2,7,6};
        LeetCode42 leetCode42 = new LeetCode42();
        System.out.println(leetCode42.trap2(height));
    }

    public int trap1(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int ans = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

    public int trap2(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int left = 0, right = n - 1;
        int ans = 0, leftMax = 0, rightMax = 0;
        while (left <= right) {

            if (leftMax <= rightMax) {
                leftMax = Math.max(leftMax, height[left]);
                ans += leftMax - height[left];
                left++;

            } else {
                rightMax = Math.max(rightMax, height[right]);
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }

}
