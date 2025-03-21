package org.example.linkedlist;
class Node {
    int value;
    Node next;
    public Node(int value) {
        this.value = value;
    }
}

public class ReverseLinkedList {
    public static Node reverse(Node head){
        Node previous = null;
        Node current = head;
        while(current != null){
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        print(head);
        print(reverse(head));
    }
}