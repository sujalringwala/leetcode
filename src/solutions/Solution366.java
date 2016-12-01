package solutions;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 366. Find Leaves of Binary Tree
 *
 * Given a binary tree, collect a tree's nodes as if you were doing this:
 * Collect and remove all leaves, repeat until the tree is empty.
 *
 * Example:
 * Given binary tree
 *
 *          1
 *         / \
 *        2   3
 *       / \
 *      4   5
 *
 * Returns [4, 5, 3], [2], [1].
 *
 * Explanation:
 * 1. Removing the leaves [4, 5, 3] would result in this tree:
 *          1
 *         /
 *        2
 *
 * 2. Now removing the leaf [2] would result in this tree:
 *          1
 *
 * 3. Now removing the leaf [1] would result in the empty tree:
 *          []
 *
 * Returns [4, 5, 3], [2], [1].
 */

public class Solution366 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    public int helper(List<List<Integer>> result, TreeNode node) {
        if (node == null) return 0;

        int left = helper(result, node.left);
        int right = helper(result, node.right);
        int height = Math.max(left, right) + 1;

        while (result.size() < height)
            result.add(new ArrayList<>());
        result.get(height - 1).add(node.val);
        return height;
    }
}
