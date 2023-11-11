package com.vab.datastructure.collections.linkedlist;

public class LinkedList {

    Node head;
    private int size;

    LinkedList() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node n = head;
        if (n == null) {
            System.out.println("List is empty");
            return;
        }

        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }

        System.out.println("null");
    }

    public void addLast(String value) {
        Node newNode = new Node(value);

        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void addFirst(String value) {
        Node newNode = new Node(value);

        size++;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, String value) {
        if (index >= getSize() - 1 || index < 0) {
            System.out.println("Provide valid index");
            return;
        }
        size++;
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value);

        Node currNode = head;
        for (int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node nextNode = head.next;
        while (nextNode.next != null) {
            currNode = nextNode;
            nextNode = nextNode.next;
        }

        currNode.next = null;
    }

    public int search(String key) {
        Node currNode = head;
        for (int i = 0; i < size; i++) {
            if (key.equals(currNode.data)) {
                return i;
            }
            currNode = currNode.next;
        }
        return -1;
    }

    public void deleteNodesGreaterThan25() {

        // To find the first number less than 25 to mark it as head
        while (head != null && Integer.parseInt(head.data) > 25) {
            head = head.next;
            size--;
        }

        if (head == null) {
            return;
        }

        Node previousNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            if (Integer.parseInt(currNode.data) > 25) {
                previousNode.next = currNode.next;
                currNode = currNode.next;
                size--;

            } else {
                previousNode = currNode;
                currNode = currNode.next;
            }

        }
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        prevNode.next = null;

        while (currNode != null) {
            Node nextNode = currNode.next;

            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head = prevNode;

    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
