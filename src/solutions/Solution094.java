package solutions;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * For example:
 * Given binary tree [1,null,2,3],
 *
 *  1
 *   \
 *    2
 *   /
 *  3
 *
 * return [1,3,2].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class Solution094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            values.add(node.val);
            node = node.right;
        }
        return values;
    }
}