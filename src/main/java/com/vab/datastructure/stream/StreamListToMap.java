package com.vab.datastructure.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class StreamListToMap {

	public static void main(String[] args) {
		List<Product> products = Util.productList();

		// 1, "Pen", 20
		// 2, "Book", 50
		// 3, "Pencil", 10
		// 4, "Eraser", 5
		// 5, "Geometry Box", 80

		Map<Integer, Integer> productMap = products.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.price));

		System.out.println(productMap);
	}
}
