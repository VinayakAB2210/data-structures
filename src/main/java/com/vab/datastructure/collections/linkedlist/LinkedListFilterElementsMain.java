package com.vab.datastructure.collections.linkedlist;

import java.util.Scanner;

public class LinkedListFilterElementsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        System.out.println("Enter numbers in the range 1 to 50. Enter any number greater than 50 to stop");
        Integer temp = sc.nextInt();

        while (temp <= 50) {
            ll.addLast(String.valueOf(temp));
            temp = sc.nextInt();
        }

        System.out.println("Elements in the list are - ");
        ll.printList();
        System.out.println("List Size : " + ll.getSize());
        ll.deleteNodesGreaterThan25();
        System.out.println("Elements in the list after deletion of numbers > 25 ");
        ll.printList();
        System.out.println("List Size : " + ll.getSize());
        // 23 --> 26 --> 24 --> 27 --> 25 --> 28 --> 21 --> 29 --> 30 --> 21
        sc.close();
    }

}
