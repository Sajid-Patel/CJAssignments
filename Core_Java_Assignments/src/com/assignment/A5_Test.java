package com.assignment;

import java.util.Scanner;

/*
 Take two number from end user and print bigger number 
 */
class A5_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers to check bigger number");

		int num1 = s.nextInt();
		int num2 = s.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + "  is Bigger number");
		} else {
			System.out.println(num2 + "  is Bigger number");
		}
	}

}
