package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ArrayUtil;

import java.util.Deque;
import java.util.LinkedList;

public class Offer59_I {

    public static void main(String[] args) {
        Offer59_I offer59_i = new Offer59_I();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        ArrayUtil.printArray(offer59_i.maxSlidingWindow(nums, 3));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        int[] res = new int[n - k + 1];
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }
        res[0] = queue.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if (queue.peekFirst().equals(nums[i - k])) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.removeLast();
            }
            queue.addLast(nums[i]);
            res[i - k + 1] = queue.peekFirst();
        }
        return res;
    }

}
