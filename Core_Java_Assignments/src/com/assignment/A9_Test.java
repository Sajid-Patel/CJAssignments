package com.assignment;

class A9_Test {
	/*
	 * Take array of name String[] name = { "Sajid", "Baban", "Mobin", "Tanjim",
	 * "Nilofar" };
	 * 
	 * print using 1)index 2)for loop 3) for-each loop
	 */
	public static void main(String[] args) {
		String[] name = { "Sajid", "Baban", "Mobin", "Tanjim", "Nilofar" };

		System.out.println(name[1]);
		System.out.println(name[0]);
		System.out.println(name[4]);

		System.out.println(" ");

		for (int i = 0; i < 4; i++) {
			System.out.println(name[i]);
		}

		System.out.println(" ");
		
		for (String n : name) {
			System.out.println(n);
		}

	}

}
