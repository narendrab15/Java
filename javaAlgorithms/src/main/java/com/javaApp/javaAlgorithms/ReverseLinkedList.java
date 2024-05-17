package com.javaApp.javaAlgorithms;

public class ReverseLinkedList {

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node reversedHead = reverseLinkedList(head);
        System.out.println("Original linked list:");
        printLinkedList(head);
        System.out.println("Reversed linked list:");
        printLinkedList(reversedHead);
    }

    private static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
