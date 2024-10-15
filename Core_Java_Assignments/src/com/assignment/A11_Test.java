package com.assignment;

/*
 int[] numbers={7,3,9,4,89,76,34};
 1} Stop the data when even number occurs
 2} Skip the even number
 */
class A11_Test {

	public static void main(String[] args) {
		int[] numbers = { 7, 3, 9, 4, 89, 76, 34 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				break;
			}
			System.out.println(numbers[i]);
		}

		System.out.println(" ");

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				continue;
			}
			System.out.println(numbers[i]);
		}
	}

}
