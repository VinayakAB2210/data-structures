package com.vab.datastructure.stream;

import java.util.List;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class StreaMaxMinDemo {

	public static void main(String[] args) {
		List<Product> products = Util.productList();
		
		// 1, "Pen", 20
		// 2, "Book", 50
		// 3, "Pencil", 10
		// 4, "Eraser", 5
		// 5, "Geometry Box", 80

		Product max = products
				.stream()
				.max((p, q) -> p.price > q.price ? 1 : -1)
				.get();
		System.out.println("Max Product - " + max.name + " " + max.price);

		Product min = products
				.stream()
				.min((p, q) -> p.price > q.price ? 1 : -1)
				.get();
		System.out.println("Min Product - " + min.name + " " + min.price);

	}

}
