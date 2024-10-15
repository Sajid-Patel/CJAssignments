package com.assignment;

import java.util.Scanner;

/*
 Write a program using while loop
 
 Take the student data : rollno, name, marks from end user 
after taking the data ,just print the data
 After printing give the message to end user "Do you want one more record (Y/N)"
 Y: Again take the data and print the data
 N: Stop the execution
 */
class A13_Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("Enter Student data....");

			System.out.println("Rollno = ");
			int rollNo = s.nextInt();

			System.out.println("Name = ");
			String name = s.next();

			System.out.println("Marks = ");
			int marks = s.nextInt();

			System.out.println("RollNo = " + rollNo + " " + "Name = " + name + " " + "Marks = " + marks);

			System.out.println("Do you want one more record ( Y/N )");
			String option = s.next();

			if (option.equalsIgnoreCase("N")) {
				break;
			}
		}
		s.close();
	}

}
