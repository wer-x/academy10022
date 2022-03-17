package by.academy.homework.arrays;

import java.util.Arrays;

public class Hw2 {
	public static void main(String... args) {

		int[] array = new int[50];
		// System.out.println(Arrays.toString(array));
		for (int i = 0; i <= array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				if (j % 2 == 1) {
					array[j]=i;
				}
			}
			System.out.println(array[i] + "   ");

		}

	}
}
