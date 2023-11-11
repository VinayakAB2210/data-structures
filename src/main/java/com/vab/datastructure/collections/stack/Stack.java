package com.vab.datastructure.collections.stack;

public class Stack {
	int capacity = 5;
	int stack[] = new int[capacity];
	int top = -1;

	public void push(int val) {
		if (top == capacity - 1) {
			System.out.println("Stack is full");
		} else {
			System.out.println("Push " + val);
			stack[++top] = val;
		}
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int last = stack[top];
			stack[top--] = 0;
			return last;
		}

	}

	public int peek() {
		return stack[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top < 0;
	}

}
