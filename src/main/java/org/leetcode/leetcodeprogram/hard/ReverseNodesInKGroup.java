package org.leetcode.leetcodeprogram.hard;

public class ReverseNodesInKGroup {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode starterNode = new ListNode(0);
        starterNode.next = head;
        ListNode groupPrevious = starterNode;
        while (true) {
            ListNode kthNode = getKthNode(groupPrevious, k);
            if (kthNode == null) break;
            ListNode groupNext = kthNode.next;
            ListNode prevNode = groupNext;
            ListNode currentNode = groupPrevious.next;
            while (currentNode != groupNext) {
                ListNode nextNode = currentNode.next;
                currentNode.next = prevNode;
                prevNode = currentNode;
                currentNode = nextNode;
            }
            ListNode temp = groupPrevious.next;
            groupPrevious.next = kthNode;
            groupPrevious = temp;
        }
        return starterNode.next;
    }

    private static ListNode getKthNode(ListNode startNode, int k) {
        while (startNode != null && k > 0) {
            startNode = startNode.next;
            k--;
        }
        return startNode;
    }

}
