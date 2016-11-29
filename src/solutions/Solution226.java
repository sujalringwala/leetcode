package solutions;

import common.TreeNode;

/**
 * 226. Invert Binary Tree
 *
 * Flip left and right.
 */

public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode leftInverted = invertTree(root.left);
        TreeNode rightInverted = invertTree(root.right);
        root.left = rightInverted;
        root.right = leftInverted;
        return root;
    }
}