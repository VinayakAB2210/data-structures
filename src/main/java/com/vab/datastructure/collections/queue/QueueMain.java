package com.vab.datastructure.collections.queue;

public class QueueMain {

	public static void main(String[] args) {
		CircularQueueUsingArray q = new CircularQueueUsingArray();

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		

		q.dequeue();
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);

		q.show();
		System.out.println("Size : " + q.getSize());

		System.out.println("Queue Empty? : " + q.isEmpty());
		System.out.println("Queue Full? : " + q.isFull());

	}

}
