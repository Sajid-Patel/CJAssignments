package com.assignment;

import java.util.Scanner;

/*
 Take the input from end user, checking it is Positive or Negative or Zero 
 */
class A3_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to check Positive or Negative or Zero");
		int number = s.nextInt();
		if (number > 0) {
			System.out.println("Positive");
		} else if (number < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		s.close();
	}

}
