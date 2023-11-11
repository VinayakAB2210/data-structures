package com.vab.datastructure.utility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String args[]) {
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("ONE");
		hashSet.add("TWO");
		hashSet.add("THREE");
		hashSet.add("FOUR");
		hashSet.add("FIVE");
		hashSet.add(null);
		hashSet.add("SIX");
		hashSet.add("FIVE");
		hashSet.add(null);

		Iterator<String> it = hashSet.iterator();

		System.out.println("Elements from HashSet");
		while (it.hasNext()) {

			System.out.print(it.next() + "\t");
		}

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("ONE");
		linkedHashSet.add("TWO");
		linkedHashSet.add("THREE");
		linkedHashSet.add("FOUR");
		linkedHashSet.add("FIVE");
		linkedHashSet.add(null);
		linkedHashSet.add("SIX");
		linkedHashSet.add("FIVE");
		linkedHashSet.add(null);
		

		Iterator<String> linkedHashSetIt = linkedHashSet.iterator();

		System.out.println("\nElements from LinkedHashSet");
		while (linkedHashSetIt.hasNext()) {

			System.out.print(linkedHashSetIt.next() + "\t");
		}
		
		TreeSet<String> linkedTreeSet = new TreeSet<String>();
		
		linkedTreeSet.add("ONE");
		linkedTreeSet.add("TWO");
		linkedTreeSet.add("THREE");
		linkedTreeSet.add("FOUR");
		linkedTreeSet.add("FIVE");
		// linkedTreeSet.add(null); Throws NPE
		linkedTreeSet.add("SIX");
		linkedTreeSet.add("FIVE");
		

		Iterator<String> linkedTreeSetIt = linkedTreeSet.iterator();

		System.out.println("\nElements from TreeSet");
		while (linkedTreeSetIt.hasNext()) {

			System.out.print(linkedTreeSetIt.next() + "\t");
		}

	}
}
