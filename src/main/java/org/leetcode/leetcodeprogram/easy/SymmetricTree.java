package org.leetcode.leetcodeprogram.easy;

public class SymmetricTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int value) { this.val = value; }
        TreeNode(int value, TreeNode leftChild, TreeNode rightChild) {
            this.val = value;
            this.left = leftChild;
            this.right = rightChild;
        }
    }

    public static boolean isSymmetric(TreeNode rootNode) {
        if (rootNode == null) {
            return true;
        }
        return isMirror(rootNode.left, rootNode.right);
    }

    private static boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        if (leftNode.val != rightNode.val) {
            return false;
        }
        return isMirror(leftNode.left, rightNode.right) &&
                isMirror(leftNode.right, rightNode.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );
        System.out.println(isSymmetric(root));
    }
}
