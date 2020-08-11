package com.nightji.leetcode;

import java.util.Stack;

public class LeetCode20 {

    public static void main(String[] args) {
        LeetCode20 leetCode20 = new LeetCode20();
        String s = "]";
        System.out.println(leetCode20.isValid(s));
    }

    public boolean isValid(String s) {
        int length = s.length();
        if (length < 1) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            Character c = s.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek().equals('{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }


}
