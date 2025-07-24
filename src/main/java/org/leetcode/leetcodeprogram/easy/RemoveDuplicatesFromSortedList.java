package org.leetcode.leetcodeprogram.easy;

public class RemoveDuplicatesFromSortedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode headNode) {
        ListNode currentNode = headNode;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return headNode;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode test1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        printList(deleteDuplicates(test1));
        ListNode test2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        printList(deleteDuplicates(test2));
    }
}
