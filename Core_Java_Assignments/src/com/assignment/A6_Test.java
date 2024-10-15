package com.assignment;

import java.util.Scanner;

/*
 * Solve using Switch Cases=
 
 Take the day from end user
  Monday - Friday : Weekdays focus on work
  Saturday Sunday : Weekend enjoy party
  
  If user entered wrong data give proper error information
 */
class A6_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Day....");
		String day = s.next();

		switch (day) {
		case "Monday":
		case "Tueday":
		case "Wedday":
		case "Thursday":
		case "Friday":
			System.out.println("Weekdays focus on work....");
			break;

		case "Saturday":
		case "Sunday":
			System.out.println("Weekend enjoy party....");
			break;
		}
		s.close();
	}

}
