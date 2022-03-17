package by.academy.homework;

import java.io.IOException;

public class Hw1 {
	public static void main(String[] args) throws IOException {
		int x = System.in.read();
		System.out.println("x = " + x);
		for (int i = 0; i < 5; i++) {

			System.out.println("------");
			System.out.println("x = " + x);
			if (x % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			if ((x & 1) == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

	}
}
