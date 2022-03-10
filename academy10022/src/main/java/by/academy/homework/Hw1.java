package by.academy.homework;

public class Hw1 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println("------");
			System.out.println("i = " + i);
			if (i % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			if ((i & 1) == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

	}
}
