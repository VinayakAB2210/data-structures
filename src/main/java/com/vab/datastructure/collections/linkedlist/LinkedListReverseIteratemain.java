package com.vab.datastructure.collections.linkedlist;

import java.util.Scanner;

public class LinkedListReverseIteratemain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList ll = new LinkedList();

        ll.addLast("1");
        ll.addLast("5");
        ll.addLast("7");
        ll.addLast("3");
        ll.addLast("8");
        ll.addLast("2");

        System.out.println("Original list elements are ");
        ll.printList();

        ll.reverseIterate();
        System.out.println("List elements after reverse are ");
        ll.printList();

        sc.close();

    }

}
