package com.vab.datastructure.collections.queue;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {

	private Deque<Integer> cacheQueue;
	private Set<Integer> cachedPageSet;
	private final int CACHE_SIZE;

	public LRUCache(int capacity) {
		cacheQueue = new LinkedList<>();
		cachedPageSet = new HashSet<>();
		CACHE_SIZE = capacity;
	}

	public void refer(int page) {
		if (!cachedPageSet.contains(page)) {
			if (cacheQueue.size() == CACHE_SIZE) {
				int last = cacheQueue.removeLast();
				cachedPageSet.remove(last);
			}
		} else {
			cacheQueue.remove(page);
		}

		cacheQueue.push(page);
		cachedPageSet.add(page);

	}

	public void display() {
		Iterator<Integer> it = cacheQueue.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);

		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(1);
		cache.refer(4);

		cache.display();

		cache.refer(5);
		cache.refer(3);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(5);

		cache.display();
	}

}
