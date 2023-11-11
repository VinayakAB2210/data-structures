package com.vab.datastructure.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class StreamMethodReference {

	public static void main(String[] args) {
		List<Product> products = Util.productList();

		// 1, "Pen", 20
		// 2, "Book", 50
		// 3, "Pencil", 10
		// 4, "Eraser", 5
		// 5, "Geometry Box", 80

		List<Integer> prices = products.stream()
				.filter(p -> p.name.startsWith("P"))
				.map(Product::getPrice)
				.collect(Collectors.toList());

		System.out.println(prices);
	}

}
