package by.academy.homework.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		final int HAND = 5;
		int cardsnum = 52;
		ArrayList<String> cards = new ArrayList<String>();
		cards.add("2s");
		cards.add("2c");
		cards.add("2d");
		cards.add("2h");
		cards.add("3s");
		cards.add("3c");
		cards.add("3d");
		cards.add("3h");
		cards.add("4s");
		cards.add("4c");
		cards.add("4d");
		cards.add("4h");
		cards.add("5s");
		cards.add("5c");
		cards.add("5d");
		cards.add("5h");
		cards.add("6s");
		cards.add("6c");
		cards.add("6d");
		cards.add("6h");
		cards.add("7s");
		cards.add("7c");
		cards.add("7d");
		cards.add("7h");
		cards.add("8s");
		cards.add("8c");
		cards.add("8d");
		cards.add("8h");
		cards.add("9s");
		cards.add("9c");
		cards.add("9d");
		cards.add("9h");
		cards.add("10s");
		cards.add("10c");
		cards.add("10d");
		cards.add("10h");
		cards.add("Js");
		cards.add("Jc");
		cards.add("Jd");
		cards.add("Jh");
		cards.add("Qs");
		cards.add("Qc");
		cards.add("Qd");
		cards.add("Qh");
		cards.add("Ks");
		cards.add("Kc");
		cards.add("Kd");
		cards.add("Kh");
		cards.add("As");
		cards.add("Ac");
		cards.add("Ad");
		cards.add("Ah");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players");
		int n = sc.nextInt();
		Random rand = new Random();
		String[][] players = new String[n][HAND];
		int[] uniq = new int[cardsnum];
		if (n <= cards.size() / HAND && n > 0) {
			for (int i = 0; i < HAND; i++) {
				for (int j = 0; j < n; j++) {
					uniq[i] = rand.nextInt(cardsnum);
					players[j][i] = cards.get(uniq[i]);
					cards.remove(uniq[i]);
					cardsnum--;
				}
			}
			System.out.println(Arrays.deepToString(players));
		} else {
			System.out.println("Enter other number of players!");
		}
		sc.close();
	}

}
