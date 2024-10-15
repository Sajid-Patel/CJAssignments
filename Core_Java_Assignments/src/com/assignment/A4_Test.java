package com.assignment;

import java.util.Scanner;

/*
 Take student Name
 
 Take Science marks
 Take Social Studies marks
 Take Maths marks
 
 >=75     grade="A"
 60 to 74 grade="B"
 45 to 59 grade="C"
  <45     grade="D"
  
  Hey Sajid your total Marks 280 your percentage is 80% Your Grade is A
 */
class A4_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Details");

		System.out.println("Enter Name");
		String name = s.next();

		System.out.println("Enter marks obtained in Science");
		int science = s.nextInt();

		System.out.println("Enter marks obtained in Social Studies");
		int socialStudies = s.nextInt();

		System.out.println("Enter marks obtained in Maths");
		int maths = s.nextInt();

		int total, avg;
		char grade;

		total = science + socialStudies + maths;
		avg = total / 3;

		if (avg >= 75) {
			grade = 'A';
		} else if (avg >= 60 && avg <= 74) {
			grade = 'B';
		} else if (avg >= 45 && avg <= 59) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		System.out.println("Your total score is = " + total);
		System.out.println("Your percentage is = " + avg);
		System.out.println("Your grade is = " + grade);

	}

}
