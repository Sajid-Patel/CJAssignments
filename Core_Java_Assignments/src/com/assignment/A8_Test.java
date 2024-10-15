package com.assignment;

/*
 Take the array int[] 10,20,30,40,50 print all values except 10 & 30
 */
class A8_Test {

	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40, 50, 60 };
		for (int number : numbers) {
			if (number == 10 || number == 30) {
				 continue;
				
			}
			System.out.println(number);
		}
	}

}
