package com.vab.datastructure.lambda_expression;

public class LambdaExpression1 {

	public static void main(String args[]) {
		Drawable d1 = str -> {
			System.out.println("Draw " + str);
		};

		d1.draw("Circle");
	}
}

interface Drawable {
	public void draw(String str);
}
