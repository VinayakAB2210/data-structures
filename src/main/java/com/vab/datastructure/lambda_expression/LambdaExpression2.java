package com.vab.datastructure.lambda_expression;

public class LambdaExpression2 {

	public static void main(String[] args) {

		Sayable s1 = message -> {
			String str1 = "I would like to say ";

			System.out.println(str1 + message);

		};

		s1.say("time is precious");
	}

}

interface Sayable {
	public void say(String str);
}
