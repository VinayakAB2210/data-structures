package com.vab.datastructure.collections.linkedlist;

import java.util.Scanner;

public class LinkedListSearchMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList ll = new LinkedList();

        ll.addLast("1");
        ll.addLast("5");
        ll.addLast("7");
        ll.addLast("3");
        ll.addLast("8");
        ll.addLast("2");
        ll.addLast("3");

        System.out.println("List elements are ");
        ll.printList();

        System.out.println("Enter the element to search in the linkedList");
        String key = sc.next();
        int index = ll.search(key);

        if (index >= 0) {
            System.out.println("The index of the key - " + key + " in list is " + index);
        } else {
            System.out.println("Key not found in the list");
        }
        
        sc.close();

    }

}
