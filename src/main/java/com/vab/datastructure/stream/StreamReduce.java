package com.vab.datastructure.stream;

import java.util.List;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class StreamReduce {

	public static void main(String[] args) {
		List<Product> products = Util.productList();
		
		// 1, "Pen", 20
		// 2, "Book", 50
		// 3, "Pencil", 10
		// 4, "Eraser", 5
		// 5, "Geometry Box", 80
		
		Integer totalCost = products
				.stream()
				.map(p -> p.price)
				.reduce(0, (a, b) -> a + b);
		
		System.out.println("Total cost of all items - " + totalCost);
		
		Integer totalCost2 = products
				.stream()
				.filter(p -> p.id >= 3)
				.map(p -> p.price)
				.reduce(0, Integer::sum);
		System.out.println("Total cost of items with id greater than 2 - " + totalCost2);
	}
}
