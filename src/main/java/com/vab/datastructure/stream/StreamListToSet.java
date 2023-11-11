package com.vab.datastructure.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class StreamListToSet {

	public static void main(String[] args) {
		List<Product> products = Util.productList();
		products.add(new Product(6, "Small Book", 20));

		// 1, "Pen", 20
		// 2, "Book", 50
		// 3, "Pencil", 10
		// 4, "Eraser", 5
		// 5, "Geometry Box", 80
		// 6, "Small Book", 20
		
		System.out.println("Product prices as list");
		List<Integer> priceList = products
				.stream()
				.map(p -> p.price)
				.filter(p -> p>10)
				.collect(Collectors.toList());
		priceList.forEach(System.out::println);

		System.out.println("Product prices as set");
		Set<Integer> priceSet = products
				.stream()
				.map(p -> p.price)
				.filter(p -> p>10)
				.collect(Collectors.toSet());

		priceSet.forEach(System.out::println);
	}
}
