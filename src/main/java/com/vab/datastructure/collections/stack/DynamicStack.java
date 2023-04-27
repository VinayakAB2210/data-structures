package com.vab.datastructure.collections.stack;

public class DynamicStack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = -1;

	public void push(int val) {
		if (size() == capacity) {
			expand();
		}
		System.out.println("Push " + val);
		stack[++top] = val;
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

			if (size() < (capacity / 4)) {
				shrink();
			}
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

	private void expand() {
		System.out.println("Expanding the stack array ");
		capacity = capacity * 2;
		int newArr[] = new int[capacity];
		System.arraycopy(stack, 0, newArr, 0, size());
		stack = newArr;

	}

	private void shrink() {
		System.out.println("Shrinking the stack array ");

		capacity = capacity / 2;
		int newArr[] = new int[capacity];
		System.arraycopy(stack, 0, newArr, 0, size());
		stack = newArr;

	}

}
