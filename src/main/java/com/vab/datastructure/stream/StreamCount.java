package com.vab.datastructure.stream;

import java.util.List;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class StreamCount {

	public static void main(String[] args) {
		List<Product> products = Util.productList();
		
		// 1, "Pen", 20
		// 2, "Book", 50
		// 3, "Pencil", 10
		// 4, "Eraser", 5
		// 5, "Geometry Box", 80
		
		long count = products.stream().filter(p -> p.price > 5).count();
		System.out.println(count);
	}

}
