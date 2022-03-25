package by.academy.classwork.lesson5;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Strings: ");
		int n = scanner.nextInt();
		String[] arr = new String[n];
		String sString = null;
		String lString = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter String: " + (i + 1));
			arr[i] = scanner.next();

		}
		int temp1 = arr[0].length();
		int temp2 = arr[0].length();
		for (int i = 0; i < n; i++) {
			if (arr[i].length() < temp1) {
				sString = arr[i];
				temp1 = arr[i].length();
				System.out.println(arr[i]);
			}
			if (arr[i].length() > temp2) {
				lString = arr[i];
				temp2 = arr[i].length();
			}
		}

		System.out.println(sString + " " + lString);
		scanner.close();

	}

}
