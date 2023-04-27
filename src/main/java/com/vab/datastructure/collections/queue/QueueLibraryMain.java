package com.vab.datastructure.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLibraryMain {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println(queue.poll());
		
		queue.add(10);
		queue.add(30);
		queue.add(40);
		queue.add(20);
			
		queue.add(80);
		queue.add(70);
		
		for(Integer i : queue) {
			System.out.println(i);
		}
		

	}

}
