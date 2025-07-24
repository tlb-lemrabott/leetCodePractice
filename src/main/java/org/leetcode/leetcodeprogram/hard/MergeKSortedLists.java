package org.leetcode.leetcodeprogram.hard;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode currentListHead : lists) {
            if (currentListHead != null) {
                minHeap.offer(currentListHead);
            }
        }
        ListNode mergedHead = new ListNode(0);
        ListNode currentMergedNode = mergedHead;

        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll();
            currentMergedNode.next = smallestNode;
            currentMergedNode = currentMergedNode.next;

            if (smallestNode.next != null) {
                minHeap.offer(smallestNode.next);
            }
        }

        return mergedHead.next;
    }
}

