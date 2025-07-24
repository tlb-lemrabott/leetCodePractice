package org.leetcode.leetcodeprogram.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode rootNode) {
        List<Integer> inorderValues = new ArrayList<>();
        traverseInorder(rootNode, inorderValues);
        return inorderValues;
    }
    private static void traverseInorder(TreeNode currentNode, List<Integer> result) {
        if (currentNode == null) {
            return;
        }
        traverseInorder(currentNode.left, result);
        result.add(currentNode.val);
        traverseInorder(currentNode.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(inorderTraversal(root));
    }

}
