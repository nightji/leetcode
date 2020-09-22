package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ListNode;

public class Offer18 {

    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode prev = null, cur = head;
        while (cur != null) {
            prev = cur;
            if (cur.val == val) {
                break;
            }
            cur = cur.next;
        }
        if (prev != null) {
            prev.next = prev.next.next;
        }
        return head;
    }

}
