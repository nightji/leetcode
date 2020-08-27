package com.nightji.leetcode.offer;

import com.nightji.leetcode.basic.ListNode;

import java.util.Arrays;

public class Offer24 {

    public static void main(String[] args) {
        ListNode head = ListNode.init(Arrays.asList(1, 2, 3, 4, 5));
        Offer24 offer24 = new Offer24();
        ListNode.printNode(offer24.reverseList2(head));
    }


    public ListNode reverseList(ListNode head) {
       ListNode cur = null, prev = head;
       ListNode temp = new ListNode();
       while (prev != null) {
           temp = prev.next;
           prev.next = cur;
           cur = prev;
           prev = temp;
       }
       return cur;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }

}
