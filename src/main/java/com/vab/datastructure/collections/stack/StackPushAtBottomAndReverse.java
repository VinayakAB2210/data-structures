package com.vab.datastructure.collections.stack;

import java.util.Stack;

public class StackPushAtBottomAndReverse {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(2);
        s.push(3);
        s.push(4);

        StackPushAtBottomAndReverse ob = new StackPushAtBottomAndReverse();
        ob.pushAtBottom(1, s);

        System.out.println("Reversing stack");
        ob.reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

    public void pushAtBottom(int data, Stack<Integer> s) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(data, s);
        s.push(temp);
    }

    public void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);

    }
}
