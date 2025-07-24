package org.leetcode.leetcodeprogram.easy;

public class PathSum {
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}
