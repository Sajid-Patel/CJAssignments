package com.assignment;

import java.util.Scanner;

/*
 From end user=
 Take Starting number 
 Take end number
 and print all numbers from starting to ending
 */
class A19_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting number");
		int starting = s.nextInt();

		System.out.println("Enter Ending number");
		int ending = s.nextInt();

		/*
		 * using for loop= 
		 * for (int i = starting; i <= ending; i++) {
		 * System.out.println(i);
		 *  }
		 */

		// using while loop=
		while (starting <= ending) {
			System.out.println(starting);
			starting++;
		}
	}

}
