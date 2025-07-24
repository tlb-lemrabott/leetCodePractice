package org.leetcode.codereport.LinkedList;

public class PrintLinkedList {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static void printLinkedList(Node node){
        Node current = node;
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1, new Node(2, new Node(3, new Node(4))));
        Node node2 = new Node(1, new Node(9, new Node(9, new Node(9, new Node(9,
                new Node(9, new Node(9, new Node(9, new Node(9, new Node(9))))))))));

        printLinkedList(node);
    }


}
