package org.leetcode.leetcodeprogram.medium;

public class AddTwoNumbers {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        ListNode tempHead = new ListNode(0);
        ListNode currentNode = tempHead;
        int carry = 0;
        ListNode node1 = firstList;
        ListNode node2 = secondList;

        while (node1 != null || node2 != null) {
            int value1 = (node1 != null) ? node1.val : 0;
            int value2 = (node2 != null) ? node2.val : 0;

            int total = value1 + value2 + carry;
            carry = total / 10;

            currentNode.next = new ListNode(total % 10);
            currentNode = currentNode.next;

            if (node1 != null) node1 = node1.next;
            if (node2 != null) node2 = node2.next;
        }

        if (carry > 0) {
            currentNode.next = new ListNode(carry);
        }

        return tempHead.next;
    }

    public static void readLinkedList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode resultNode = addTwoNumbers(l1, l2);
        readLinkedList(resultNode);
    }
}
