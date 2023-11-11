package com.vab.datastructure.collections.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("4");
        list.insertAt(4, "3");

        list.printList();
        System.out.println("List Size : " + list.getSize());
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println("List Size : " + list.getSize());

    }

}
