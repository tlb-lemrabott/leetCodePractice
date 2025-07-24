package org.leetcode.leetcodeprogram.easy;

public class MinimumDepthOfBinaryTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int value) {
            this.val = value;
        }
        TreeNode(int value, TreeNode leftChild, TreeNode rightChild) {
            this.val = value;
            this.left = leftChild;
            this.right = rightChild;
        }
    }
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }


}
