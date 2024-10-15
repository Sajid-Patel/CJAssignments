package com.assignment;

import java.util.Scanner;

/*
 Take a number from end user,(1:numbers or 2:even or 3:odd)
 System.out.println("Enter your option 1: All numbers or 2: even numbers or 3: odd numbers");
 1:Print all the numbers from 1-10
 2:Print even numbers from 1-10
 3:Print odd numbers from 1-10
 Other then above case give proper error information
 */
class A17_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your option 1: All numbers or 2: even numbers or 3: odd numbers");
		int number = s.nextInt();

		switch (number) {
		case 1:
			System.out.println("Printing numbers from 1-10");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
			break;

		case 2:
			System.out.println("Printing even numbers");
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}

			break;

		case 3:
			System.out.println("Printing odd numbers");
			for (int i = 1; i <= 10; i++) {
				if (i % 2 != 0)
					System.out.println(i);
			}
			break;

		default:
			System.out.println("Enter valid option");
			break;
		}

	}
}
