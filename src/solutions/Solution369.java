package solutions;

import common.ListNode;

/**
 * 369. Plus One Linked List
 *
 * Given a non-negative number represented as a singly linked list of digits,
 * plus one to the number.
 *
 * The digits are stored such that the most significant digit is at the head
 * of the list.
 *
 * Example:
 *
 * Input:
 * 1->2->3
 *
 * Output:
 * 1->2->4
 */

public class Solution369 {
    public ListNode plusOne(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = prev;
        prev = null;

        int carry = 1, sum;
        while (curr != null) {
            sum = curr.val + carry;
            carry = sum / 10;
            curr.val = sum % 10;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (carry == 1) {
            head = new ListNode(1);
            head.next = prev;
            return head;
        } else return prev;
    }
}
