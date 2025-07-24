package org.leetcode.leetcodeprogram.easy;

public class MaximumDepthOfBinaryTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int value) {
            this.val = value;
        }
        TreeNode(int value, TreeNode leftChild, TreeNode rightChild) {
            this.val = value;
            this.left = leftChild;
            this.right = rightChild;
        }
    }

    public static int maxDepth(TreeNode rootNode) {
        if (rootNode == null) {
            return 0;
        }
        int leftDepth = maxDepth(rootNode.left);
        int rightDepth = maxDepth(rootNode.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        System.out.println(maxDepth(root));
    }

}
