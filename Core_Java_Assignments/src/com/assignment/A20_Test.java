package com.assignment;

import java.util.Scanner;

/*
 From end user=
 Take Starting number 
 Take end number
 
 1]first<=last : print all numbers from starting(low) to ending(high)
 2]last>=first : print all the numbers from ending(high) to starting(low)
 */
class A20_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting number");
		int starting = s.nextInt();

		System.out.println("Enter Ending number");
		int ending = s.nextInt();
		
		if (starting <= ending) {
			while (starting <= ending) {
				System.out.println(starting);
				starting++;
			}
		} else {
			while (starting >= ending) {
				System.out.println(starting);
				starting--;
			}
		}
	}

}
