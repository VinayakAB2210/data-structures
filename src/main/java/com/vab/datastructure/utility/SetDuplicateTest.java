package com.vab.datastructure.utility;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicateTest {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		
		numbers.forEach((number) -> {
			System.out.println(number + "\t");
		});
		
		System.out.println("\n Set size = " + numbers.size());

	}

}
