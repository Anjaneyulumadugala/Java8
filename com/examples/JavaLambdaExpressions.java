package com.examples;

public class JavaLambdaExpressions {
	public static void main(String args[]) {
		JavaLambdaExpressions tester = new JavaLambdaExpressions();

		// with type declaration
		MathOperation add = (int a, int b) -> { return a+b; };

		// with out type declaration
		MathOperation sub = (a, b) -> a-b;

		// with return statement
		MathOperation mul = (int a, int b) -> {
			return a*b;
		};

		// without return statement
		MathOperation div = (int a, int b) -> a/b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, add));
		System.out.println("10 - 5 = " + tester.operate(10, 5, sub));
		System.out.println("10 x 5 = " + tester.operate(10, 5, mul));
		System.out.println("10 / 5 = " + tester.operate(10, 5, div));

		// with parenthesis
		Greeting greetService1 = message -> System.out.println("Hello " + message);

		// without parenthesis
		Greeting greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Anji");
		greetService2.sayMessage("Anjaneyulu");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface Greeting {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation operation) {
		return operation.operation(a, b);
	}
}
