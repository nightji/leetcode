package com.nightji.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer59_II {

    public static void main(String[] args) {

    }

    class MaxQueue {

        Queue<Integer> queue1;
        Deque<Integer> queue2;

        public MaxQueue() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public int max_value() {
            if (queue2.isEmpty()) return -1;
            return queue2.peekFirst();
        }

        public void push_back(int value) {
            queue1.offer(value);
            while (!queue2.isEmpty() && value > queue2.peekLast()) {
                queue2.removeLast();
            }
            queue2.addLast(value);
        }

        public int pop_front() {
            if(queue1.isEmpty()) return -1;
            int value = queue1.remove();
            if (value == queue2.peekFirst()) {
                queue2.removeFirst();
            }
            return value;
        }
    }

}
