package com.vab.datastructure.lambda_expression;

public class LambdaExpressionCreateThread {

	public static void main(String[] args) {

		Runnable r = () -> {
			System.out.println("Running thread - 1");
		};

		r.run();
	}

}
