package org.example.linkedlist;

import java.math.BigInteger;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode = convertNumberToLinkedListReversed(99999999991.0);
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9))))))))));
        readLinkedList(listNode);
//        System.out.println(convertLinkedListToInteger(l2));
        //System.out.println(convertLinkedListToInteger(listNode));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        double sum = convertLinkedListToInteger(l1) + convertLinkedListToInteger(l2);
        return convertNumberToLinkedListReversed(sum);
    }

    public static ListNode convertNumberToLinkedListReversed(double n){
        ListNode head = new ListNode( Double.valueOf(n % 10).intValue());
        ListNode tail = head;
        n = n / 10;
        while(n >= 1.0){
            double mod = n % 10.0;
            ListNode newListNode = new ListNode(Double.valueOf(mod).intValue());
            tail.next = newListNode;
            tail = tail.next;
            n = n / 10.0;
//            System.out.println(String.format("n = %3.2f, mod = %f, modInt = %d", n, mod, Double.valueOf(mod).intValue()));
        }
        return head != null ? head : new ListNode(0);
    }

    public static double convertLinkedListToInteger(ListNode listNode){
        double sum = 0.0;
        double multi = 1.0;
        ListNode current = listNode;
        while(current != null){
            sum += current.val * multi;
            multi *= 10;
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
