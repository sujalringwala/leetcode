package solutions;

import common.ListNode;

/**
 * 2. Add Two Numbers
 *
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

public class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total = l1.val + l2.val, carry;
        if (total >= 10) {
            carry = 1;
            total -= 10;
        } else {
            carry = 0;
        }
        ListNode head = new ListNode(total), node = head;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null || l2 != null) {
            int v1, v2;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            } else {
                v1 = 0;
            }
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            } else {
                v2 = 0;
            }
            total = v1 + v2 + carry;

            if (total > 9) {
                carry = 1;
                total -= 10;
            } else {
                carry = 0;
            }
            node.next = new ListNode(total);
            node = node.next;
        }
        if (carry > 0)
            node.next = new ListNode(1);
        return head;
    }
}
