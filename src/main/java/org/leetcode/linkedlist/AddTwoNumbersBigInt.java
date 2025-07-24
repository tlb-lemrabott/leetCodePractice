package org.leetcode.linkedlist;

import java.math.BigInteger;

public class AddTwoNumbersBigInt {
    public static void main(String[] args) {
        ListNode listNode = convertNumberToLinkedListReversed(BigInteger.valueOf(9991));
//        ListNode l1 = new ListNode(9);
//        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
//                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
//                        new ListNode(9))))))))));
        readLinkedList(listNode);
//        System.out.println(convertLinkedListToInteger(l2));
        System.out.println(convertLinkedListToInteger(listNode));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum = convertLinkedListToInteger(l1).add(convertLinkedListToInteger(l2));
        return convertNumberToLinkedListReversed(sum);
    }

    public static ListNode convertNumberToLinkedListReversed(BigInteger n){
        ListNode head = new ListNode(n.mod(BigInteger.TEN).intValue());
        ListNode tail = head;
        n = n.divide(BigInteger.TEN);
        while(!n.equals(BigInteger.ZERO)){
            ListNode newListNode = new ListNode(n.mod(BigInteger.TEN).intValue());
            tail.next = newListNode;
            tail = tail.next;
            n = n.divide(BigInteger.TEN);
        }
        return head != null ? head : new ListNode(0);
    }

    public static BigInteger convertLinkedListToInteger(ListNode listNode){
        BigInteger sum = BigInteger.ZERO;
        BigInteger multi = BigInteger.ONE;
        ListNode current = listNode;
        while(current != null){
            sum = sum.add(BigInteger.valueOf(current.val).multiply(multi));
            multi = multi.multiply(BigInteger.TEN);
            current = current.next;
        }
        return sum;
    }

    public static void readLinkedList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }


    public static int convertLinkedListToIntegerReversed(ListNode listNode){
        int sum = 0;
        int i = 0;
        ListNode current = listNode;
        while(current != null){
            double power = Math.pow(10, i);
            sum += current.val * (power);
            i++;
            current = current.next;
        }
        return sum;
    }

    static class ListNode {
        private int val;
        private ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
