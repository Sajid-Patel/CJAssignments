package com.assignment;

import java.util.Scanner;

/*
 Take the number from end user print the multiple table upto given number
 output- Enter a number= 4
1 * 1 = 1
1 * 2 = 2
1 * 3 = 3...etc
 
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6...etc
 
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9...etc
 
 4 * 1 = 4
 4 * 2 = 8 
 4 * 3 = 12 ...etc
 */
class A15_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number....");
		int number = s.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " +(i*j));
			}
		}
		s.close();
	}

}
