package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ListNode;

import java.util.Arrays;

public class Offer22 {

    public static void main(String[] args) {
        Offer22 offer22 = new Offer22();
        ListNode head = ListNode.init(Arrays.asList(1, 2, 3, 4, 5));
        ListNode.printNode(offer22.getKthFromEnd(head, 4));
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode l1 = head, l2 = head;
        for (int i = 0; i < k; i++) {
            if (l1 != null) {
                l1 = l1.next;
            }
        }
        while (l1 != null) {
            l1 = l1.next;
            l2 = l2.next;
        }
        return l2;
    }

}
