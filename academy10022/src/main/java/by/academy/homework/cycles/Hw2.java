package by.academy.homework.cycles;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		if (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			System.out.println("Введенное число " + n);
			for (int i = 1; i < n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		scanner.close();
	}

}
