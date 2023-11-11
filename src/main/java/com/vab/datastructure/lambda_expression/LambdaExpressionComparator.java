package com.vab.datastructure.lambda_expression;

import java.util.Collections;
import java.util.List;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class LambdaExpressionComparator {

	public static void main(String[] args) {
	
		List<Product> products = Util.productList(); 
		

		Collections.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));

		System.out.println("Sorting on the basis of name...");

		for (Product p : products) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}

}
