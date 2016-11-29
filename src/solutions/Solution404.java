package solutions;

import common.TreeNode;

/**
 * 404. Sum of Left Leaves
 *
 * Find the sum of all left leaves in a given binary tree.
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15
 * respectively. Return 24.
 */

public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumHelper(root, false);
    }

    public int sumHelper(TreeNode node, boolean isLeft) {
        if (node == null)
            return 0;
        else if (isLeft && node.left == null && node.right == null)
            return node.val;
        else
            return sumHelper(node.left, true) + sumHelper(node.right, false);
    }
}
