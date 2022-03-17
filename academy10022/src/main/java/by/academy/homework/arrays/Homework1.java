package by.academy.homework.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер массива и параметр разности");
		if (scanner.hasNextInt()) {
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			int[] array = new int[k];
			int count = 0;
			System.out.print("Заполните массив ");
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
			}
			System.out.println("Ваш массив: " + Arrays.toString(array));
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if ((array[i] - array[j]) == n) {
						count += 1;
					}
				}
			}
			System.out.println("Количество пар с заданной разность : " + count);

		}
		scanner.close();

	}

}
