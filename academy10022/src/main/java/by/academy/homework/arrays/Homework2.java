package by.academy.homework.arrays;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two words");
		String str = scanner.nextLine();
		String str2 = scanner.nextLine();
		char[] strChArray = str.toCharArray();
		char[] str2ChArray = str2.toCharArray();
		int count = 0;
		if (str.length() == str2.length()) {
			for (int i = 0; i < strChArray.length; i++) {
				for (int j = 0; j < strChArray.length; j++) {
					if (strChArray[i] == str2ChArray[j]) {
						count += 1;
						break;
					}
				}
			}

		}
		if (count == str.length()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();
	}
}
