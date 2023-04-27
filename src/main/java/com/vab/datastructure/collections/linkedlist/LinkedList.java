package com.vab.datastructure.collections.linkedlist;

public class LinkedList {

	Node head;

	public void show() {
		Node n = head;

		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}

		System.out.println(n.data);
	}

	public void insert(int value) {
		Node newnNde = new Node();
		newnNde.data = value;

		if (head == null) {
			head = newnNde;
		} else {
			Node node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newnNde;
		}

	}

	public void insertAtStart(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.next = head;
		head = newNode;

	}

	public void insertAt(int index, int value) {
		if (index == 0) {
			insertAtStart(value);
		} else {
			Node newNode = new Node();
			newNode.data = value;

			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}

			newNode.next = n.next;
			n.next = newNode;
		}
	}

}
