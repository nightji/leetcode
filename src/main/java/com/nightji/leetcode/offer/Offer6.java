package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Offer6 {

    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Deque<Integer> stack = new ArrayDeque();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }
        return res;
    }

    public int[] reversePrint2(ListNode head) {
        ListNode cur = null, prev = head;
        ListNode temp = new ListNode();
        int i = 0;
        while (prev != null) {
            temp = prev.next;
            prev.next = cur;
            cur = prev;
            prev = temp;
            i++;
        }
        int[] res = new int[i];
        i = 0;
        while (cur != null) {
            res[i++] = cur.val;
            cur = cur.next;
        }
        return res;
    }

}
