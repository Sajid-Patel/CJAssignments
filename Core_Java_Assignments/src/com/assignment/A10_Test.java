package com.assignment;

/*
 Complete below 3 operations using 3-for loops
 1] Sum of 1-10 numbers
 2] Sum of 1-10 even numbers
 3] Sum of 1-10 odd numbers
 */
class A10_Test {

	public static void main(String[] args) {

		// 1] Sum of 1-10 numbers
		int totalsum = 0;
		for (int i = 1; i <= 10; i++) {
			totalsum = totalsum + i;
		}
		System.out.println("1]Sum of 1-10 numbers = " + totalsum);

		// 2] Sum of 1-10 even numbers
		int evensum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evensum = evensum + i;
			}
		}
		System.out.println("2] Sum of 1-10 even numbers = " + evensum);

		// 3] Sum of 1-10 odd numbers
		int oddsum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				oddsum = oddsum + i;
			}
		}
		System.out.println("2] Sum of 1-10 odd numbers = " + oddsum);

	}
}

class A10b_Test {

	/*
	 * Complete below 3 operations using 1-for loops 1] Sum of 1-10 numbers 2] Sum
	 * of 1-10 even numbers 3] Sum of 1-10 odd numbers
	 */
	public static void main(String[] args) {
		int totalsum = 0;
		int evensum = 0;
		int oddsum = 0;

		for (int i = 1; i <= 10; i++) {
			totalsum = totalsum + i;

			if (i % 2 == 0) {
			}

			if (i % 2 != 0) {
			}

		}
		System.out.println("1]Sum of 1-10 numbers = " + totalsum);
		System.out.println("2] Sum of 1-10 even numbers = " + evensum);
		System.out.println("2] Sum of 1-10 odd numbers = " + oddsum);
	}
}
