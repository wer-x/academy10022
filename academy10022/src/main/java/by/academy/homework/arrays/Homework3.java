package by.academy.homework.arrays;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		String[] str = new String[n];
		String res = null;
		System.out.println("Enter " + n + " words");
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		res = str[0];
		for (int i = 0; i < n; i++) {
			if (res.length() > str[i].length()) {
				res = str[i];
			}
		}

		System.out.println("First smallest word is: " + res);
	}

}
