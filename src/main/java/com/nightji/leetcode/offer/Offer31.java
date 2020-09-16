package com.nightji.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

public class Offer31 {

    public static void main(String[] args) {
        Offer31 offer31 = new Offer31();
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        System.out.println(offer31.validateStackSequences(pushed, popped));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek().equals(popped[i])) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

}
