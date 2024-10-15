package com.assignment;

import java.util.Scanner;

/*
 Flow Control Statements
 Ex=  
Take the day from end user
MON TUE WED : print discount 5%
THU FRI : print discount 4%
SAT SUN : print discount 3%
when user entered wrong data give proper error information
*/
class A1_Test {

	public static void main(String[] args) {
		System.out.println("Enter your day");
		Scanner s = new Scanner(System.in);
		String day = s.next();

		if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today's Discount = 5% ");
		}

		else if (day.equals("Thursday") || day.equals("Friday")) {
			System.out.println("Today's Discount = 4% ");

		}

		else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today's Discount = 3% ");
		} else {
			System.out.println("Wrong input ");
		}
		s.close();
	}
}
