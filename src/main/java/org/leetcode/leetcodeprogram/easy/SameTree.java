package org.leetcode.leetcodeprogram.easy;

public class SameTree {
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

    public static boolean isSameTree(TreeNode firstRoot, TreeNode secondRoot) {
        if (firstRoot == null && secondRoot == null) {
            return true;
        }
        if (firstRoot == null || secondRoot == null || firstRoot.val != secondRoot.val) {
            return false;
        }
        boolean isLeftSame = isSameTree(firstRoot.left, secondRoot.left);
        boolean isRightSame = isSameTree(firstRoot.right, secondRoot.right);

        return isLeftSame && isRightSame;
    }
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(tree1, tree2));
    }
}
