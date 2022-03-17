package by.academy.homework.arrays;

import java.util.Arrays;

public class Hw5 {
	public static void main(String... args) {
		int array[] = { 2, 4, 5, 1, 6, 9 };
		System.out.println(Arrays.toString(array));
//		int temp = array[1];
//		array[1] = array[2];
//		array[2] = temp;
		for (int j = 0; j < (array.length - 1); j++) {

			for (int i = 0; i < (array.length - 1 - j); i++) {
				if (array[i + 1] < array[i]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
