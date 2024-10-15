package com.assignment;

import java.util.Scanner;

/*
 Take a number from end user, Check if it is positive,negative or Zero
 and print it is even or odd
 Sample Output=
 1] Enter a number= 2
 o/p Number is Positive and even
 
 2] Enter a number= -7
 o/p Number is negative and odd
 */
class A16_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number.....");
		int number = s.nextInt();

		if (number > 0) {
			if (number % 2 == 0) {
				System.out.println("Number is Positive and Even");
			} else {
				System.out.println("Number is Positive and odd");
			}
		} else if (number < 0) {
			if (number % 2 == 0) {
				System.out.println("Number is Negative and even");
			} else {
				System.out.println("Number is Negative and odd");
			}
		} else {
			System.out.println("Number is Zero");
		}
	}

}
