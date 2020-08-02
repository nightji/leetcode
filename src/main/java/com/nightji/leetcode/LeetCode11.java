package com.nightji.leetcode;

public class LeetCode11 {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        LeetCode11 leetCode11 = new LeetCode11();
        System.out.println(leetCode11.maxArea(height));
    }

    public int maxArea(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int left = 0, right = n -1;
        int ans = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            ans = Math.max(area, ans);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

}
