package com.nightji.leetcode.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode() {

    }


    public static ListNode init(List<Integer> list) {
        ListNode head = new ListNode(), dummy = new ListNode();
        head.next = dummy;
        for (Integer e : list) {
            dummy.next = new ListNode(e);
            dummy = dummy.next;
        }
        return head.next.next;
    }

    public static void printNode(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print("->");
            } else{
                System.out.println();
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.init(Arrays.asList(1, 2, 3));
        ListNode.printNode(listNode);
    }

}
