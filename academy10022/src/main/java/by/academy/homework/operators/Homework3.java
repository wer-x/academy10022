package by.academy.homework.operators;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 1 до 10");
		if (scanner.hasNextInt()) {
			int var = scanner.nextInt();
			if (var <= 0 || var > 10) {
				System.out.println("next update");
			} else {

				for (int i = 1; i <= 10; i++) {
					System.out.println("При умножении на " + i + ": " + i * var);
				}
			}
		}
		scanner.close();
	}

}
