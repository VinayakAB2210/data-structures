package com.vab.datastructure.stream;

import java.util.stream.Stream;

public class StreamIterationDemo {

	public static void main(String[] args) {
		Stream.iterate(1, v -> v+1)
		.filter(v -> v%5 == 0)
		.limit(5)
		.forEach(System.out::println);

	}

}
