package org.leetcode.leetcodeprogram.easy;

public class BalancedBinaryTree {
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

    public static boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
    private static int checkBalance(TreeNode currentNode) {
        if (currentNode == null) {
            return 0;
        }
        int leftHeight = checkBalance(currentNode.left);
        int rightHeight = checkBalance(currentNode.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }




}
