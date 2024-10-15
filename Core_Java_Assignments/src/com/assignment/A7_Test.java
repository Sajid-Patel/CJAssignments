package com.assignment;

import java.util.Scanner;

/*
  Bank ATM Pin
  In application take the pin=1234
  take the pin from end user
  if the application pin and user pin both are valid print message : Congratulations Pin is valid
  if the pin is invalid : take the pin again : take input 4-attempt after four attempts say " completed"
  
 */
class A7_Test {

	public static void main(String[] args) {
		int pin = 1234;

		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter your pin nummber...attempt=" + i);
			int userpin = s.nextInt();

			if (pin == userpin) {
				System.out.println("Congratulations... Your pin is valid");
				break;
			} else {
				System.out.println("Your Pin is invalid Enter again...");
			}

			if (i == 4) {
				System.out.println("Your attemps are completed..... By By your account blocked for 24-hours ");
			}
		}
	}

}
