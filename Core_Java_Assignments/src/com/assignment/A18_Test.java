package com.assignment;

import java.util.Scanner;

/*
Take two number from end user,
Take operator from end user
print the result
If the operator not valid give the  proper error information 
*/
class A18_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number.....");
		int num1 = s.nextInt();

		System.out.println("Enter second number.....");
		int num2 = s.nextInt();

		System.out.println("To perform operation select operator [ + - * % / ] ");
		String operator = s.next();

		int result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;

		case "*":
			result = num1 * num2;
			break;

		case "%":
			result = num1 % num2;
			break;

		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("Enter valid operator");
			break;
		}
		System.out.println("Result = " + result);
	}

}
