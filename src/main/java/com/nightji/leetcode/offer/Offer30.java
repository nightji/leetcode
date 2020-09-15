package com.nightji.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

public class Offer30 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        System.out.println(minStack.min());
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.push(0);
        minStack.pop();
        System.out.println(minStack.min());
    }

    static class MinStack {

        Deque<Integer> stack1;
        Deque<Integer> stack2;

        public MinStack() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void push(int x) {
            stack1.push(x);
            if (stack2.isEmpty() || x <= stack2.peek()) {
                stack2.push(x);
            }
        }

        public void pop() {
            if (stack1.peek().equals(stack2.peek())) {
                stack2.pop();
            }
            stack1.pop();
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            return stack2.peek();
        }
    }

}
