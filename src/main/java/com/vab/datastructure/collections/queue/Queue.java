package com.vab.datastructure.collections.queue;

public class Queue {
	private int capacity = 5;
	private int front;
	private int rear;
	private int size;

	int[] q = new int[capacity];

	public void enqueue(int data) {
		if (!isFull()) {
			q[rear] = data;
			rear = (rear + 1) % capacity;
			size++;
		} else {
			System.out.println("Queue is Full");
		}

	}

	public int dequeue() {

		int data = q[front];
		if (!isEmpty()) {
			front = (front + 1) % capacity;
			size--;
		} else {
			System.out.println("Queue is Empty");
		}

		return data;
	}

	public int getSize() {
		return size;
	}

	public void show() {
		System.out.print("Elements - ");
		for (int i = 0; i < size; i++) {
			System.out.print(q[(front + i) % 5] + " ");
		}
		System.out.println();
		for (int n : q) {
			System.out.print(n + " ");

		}
		System.out.println();
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == capacity;
	}

}
