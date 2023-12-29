package com.mphasis.work.project;
public class SortedCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    SortedCircularLinkedList() {
        head = null;
    }

    void sortedInsert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            new_node.next = new_node;
            head = new_node;
        } else if (head.data >= new_node.data) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = new_node;
            new_node.next = head;
            head = new_node;
        } else {
            Node current = head;
            while (current.next != head && current.next.data < new_node.data) {
                current = current.next;
            }
            new_node.next = current.next;
            current.next = new_node;
        }
    }

    void printList() {
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        SortedCircularLinkedList list = new SortedCircularLinkedList();
        int[] arr = {12, 56, 2, 11, 1, 90};

        for (int i : arr) {
            list.sortedInsert(i);
        }

        System.out.print("Sorted Circular Linked List: ");
        list.printList();
    }
}
