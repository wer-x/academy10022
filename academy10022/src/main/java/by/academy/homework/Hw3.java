package by.academy.homework;

public class Hw3 {
	public static void main(String[] args) {
		fc: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50; j++) {
				if (i * j == 56) {
					System.out.println("i = " + i + " " + "j = " + j);
					break fc;

				}
			}
		}
	}

}
