package solutions;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 *
 * Given a binary tree, return all root-to-leaf paths.
 * For example, given the following binary tree:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 */

public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) helper(root, "", paths);
        return paths;
    }

    public void helper(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null)
            paths.add(path + node.val);
        if (node.left != null)
            helper(node.left, path + node.val + "->", paths);
        if (node.right != null)
            helper(node.right, path + node.val + "->", paths);
    }
}
