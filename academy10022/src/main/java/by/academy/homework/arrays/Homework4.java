package by.academy.homework.arrays;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 even words");
		String f = sc.nextLine();
		String s = sc.nextLine();
		String c = null;
		if (f.length() % 2 == 0 && s.length() % 2 == 0) {
			c = f.substring(0, f.length() / 2) + s.substring(s.length() / 2);
			System.out.println("Result word is: " + c);
		} else {
			System.out.println("Wrong words");
			return;
		}

	}

}
