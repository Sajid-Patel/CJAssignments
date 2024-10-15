package com.assignment;

import java.util.Scanner;

/*
 Take the user name & password from end user.
 check the condition print the message Success or Fail 
 */
class A2_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = s.next();

		System.out.println("Enter Password");
		String password = s.next();

		if (username.equals("SajidPatel") && (password.equals("$P510"))) {
			System.out.println("Login Successful..." );
		} else {
			System.out.println("Login Failed");
		}
		s.close();
	}

}
