package com.assignment;

import java.util.Scanner;

/*
 Take the number from end user print the table
 output- Enter a number= 4
 4 * 1 = 4
 4 * 2 = 8 
 4 * 3 = 12 ...etc
 */
class A14_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number....");
		int number = s.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
		s.close();
	}

}
