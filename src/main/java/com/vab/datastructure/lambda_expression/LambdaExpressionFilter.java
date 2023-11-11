package com.vab.datastructure.lambda_expression;

import java.util.List;
import java.util.stream.Stream;

import com.vab.datastructure.utility.Product;
import com.vab.datastructure.utility.Util;

public class LambdaExpressionFilter {

	public static void main(String[] args) {
		List<Product> products = Util.productList();

		Stream<Product> filtered_data = products.stream().filter(p -> (p.price > 20000));

		filtered_data.forEach(p -> System.out.println(p.name + " - " + p.price));

	}

}
