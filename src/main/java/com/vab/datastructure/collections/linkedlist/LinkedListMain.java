package com.vab.datastructure.collections.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(8);
		list.insert(6);
		list.insert(11);
		
		list.insertAt(2, 9);
		list.insertAtStart(10);
		
		list.show();

	}

}
