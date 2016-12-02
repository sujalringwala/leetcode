package solutions;

import common.ListNode;

/**
 * 206. Reverse Linked List
 *
 * Reverse a singly linked list.
 */

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}