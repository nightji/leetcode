package com.nightji.leetcode;

import com.nightji.leetcode.basic.ListNode;

import java.util.Arrays;

public class LeetCode206 {

    public static void main(String[] args) {
        ListNode head = ListNode.init(Arrays.asList(1, 2, 3, 4, 5));
        ListNode.printNode(head);
        LeetCode206 leetCode206 = new LeetCode206();
        ListNode.printNode(leetCode206.reverseList2(head));
    }

    public ListNode reverseList1(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }


}
