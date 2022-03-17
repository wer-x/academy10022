package by.academy.homework;

public class Homework4 {

	public static void main(String[] args) {
		int x = 2;
		final int LIMIT = 1000000;
		for (int i = 1;; i++) {
			double temp = Math.pow(x, i);
			if (temp <= LIMIT) {
				System.out.println("2 в степени " + i + " : " + Math.pow(x, i));
			}
			else {
				break;
			}
		}

	}

}
