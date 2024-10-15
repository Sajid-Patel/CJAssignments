package com.assignment;

import java.util.Scanner;

/*
 1)In application take guess number= 25
  
  2)Take the guess number from end user =
  
  a] if user entered guess value is<25:
  print "You entered less than guess value, Enter again"  
  
  b]if user entered guess value is >25:
  print "You entered greater than guess value, Enter again"  
 
  c] if user entered guess value is =25:
  print "Your guess value is correct" and stop the execution  
 
 while (true)---- when we dont know no of iterations use while loop
		{
			if(guess==25) {
				break;
			}
		}
 */
class A12_Test {

	public static void main(String[] args) {
		int guess = 25;

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your Guess value....");
			int userguess = s.nextInt();

			if (userguess == guess) {
				System.out.println("Congratulations your Guess is Correct....!");
				break;
			} else if (userguess > guess) {
				System.out.println("You entered greater than guess value, try again");
			} else {
				System.out.println("You entered less than guess value, try again");
			}

		}
		s.close();
	}

}
