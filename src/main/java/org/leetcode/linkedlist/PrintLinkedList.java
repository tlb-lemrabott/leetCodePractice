package org.leetcode.linkedlist;

public class PrintLinkedList {
    class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void print(Node node){
        Node current = node;
        while(current != null){
            System.out.println(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
