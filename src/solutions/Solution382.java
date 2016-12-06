package solutions;

import common.ListNode;

import java.util.Random;

/**
 * 382. Linked List Random Node
 *
 * Given a singly linked list, return a random node's value from the linked
 * list. Each node must have the same probability of being chosen.
 *
 * Follow up:
 * What if the linked list is extremely large and its length is unknown to you?
 * Could you solve this efficiently without using extra space?
 */

public class Solution382 {
    public class Solution {

        private ListNode head;
        Random random;

        public Solution(ListNode head) {
            this.head = head;
            this.random = new Random();
        }

        public int getRandom() {
            ListNode result = null;
            ListNode current = head;

            for (int n = 1; current != null; n++) {
                if (random.nextInt(n) == 0)
                    result = current;
                current = current.next;
            }
            return result.val;
        }
    }
}
