package by.academy.homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите сумму покупки");
		if (scanner.hasNextInt()) {
			int purchase = scanner.nextInt();
			double disc = 0;
			double fpurchase = 0;

			if (purchase < 100) {
				disc = 5;
			} else if (purchase >= 100 && purchase < 200) {
				disc = 7;
			} else if (purchase >= 200 && purchase < 300) {
				System.out.println("Введите возраст");
				int age = scanner.nextInt();
				if (age < 18) {
					disc = 9;
				} else {
					disc = 16;
				}
			} else if (purchase >= 300 && purchase < 400) {
				disc = 15;
			} else {
				disc = 20;
			}
			fpurchase = purchase - purchase * (disc / 100);
			System.out.println("Ваша скидка составила: " + disc + "%\n" + "Итоговая сумма: " + fpurchase);

		} else {
			System.out.println("Вы ввели некорректное значение");
		}
		scanner.close();

	}

}
