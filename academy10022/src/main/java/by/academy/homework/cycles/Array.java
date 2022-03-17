package by.academy.homework.cycles;

//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
	public static void main(String... args) {

		Scanner scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			int[] array = new int[n];
			Random rand = new Random();

			for (int i = 0; i < array.length; i++) {
				array[i] = rand.nextInt(10);
			}

			System.out.println("initial array:");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + "   ");
			}

			System.out.println();
			for (int i = 0; i < array.length; i++) {
				array[i] += 10;
			}
			System.out.println("new array:");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + "   ");
			}
			scanner.close();
		}
	}
}