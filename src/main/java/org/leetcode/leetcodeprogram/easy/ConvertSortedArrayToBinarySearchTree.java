package org.leetcode.leetcodeprogram.easy;

public class ConvertSortedArrayToBinarySearchTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int value) {
            this.val = value;
        }
        TreeNode(int value, TreeNode leftChild, TreeNode rightChild) {
            this.val = value;
            this.left = leftChild;
            this.right = rightChild;
        }
    }
    public static TreeNode sortedArrayToBST(int[] sortedArray) {
        return buildBSTFromSortedArray(sortedArray, 0, sortedArray.length - 1);
    }
    private static TreeNode buildBSTFromSortedArray(int[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }
        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        TreeNode currentNode = new TreeNode(array[middleIndex]);
        currentNode.left = buildBSTFromSortedArray(array, startIndex, middleIndex - 1);
        currentNode.right = buildBSTFromSortedArray(array, middleIndex + 1, endIndex);
        return currentNode;
    }
    private static void printInorder(TreeNode node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.val + " ");
            printInorder(node.right);
        }
    }
    public static void main(String[] args) {
        int[] input = {-10, -3, 0, 5, 9};
        TreeNode bstRoot = sortedArrayToBST(input);
        printInorder(bstRoot);
    }

}
