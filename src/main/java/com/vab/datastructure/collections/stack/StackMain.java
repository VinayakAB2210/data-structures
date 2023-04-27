package com.vab.datastructure.collections.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.show();
		System.out.println("Stack Empty? " + stack.isEmpty());
		stack.push(10);
		stack.push(8);
		stack.push(15);
		stack.push(22);
		System.out.println("Pop - " + stack.pop());
		System.out.println("Peek - " + stack.peek());

		stack.show();
		System.out.println("Size of stack - " + stack.size());
		System.out.println("Stack Empty? " + stack.isEmpty());

	}

}
