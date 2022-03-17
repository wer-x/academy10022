package by.academy.homework;

public class Hw2 {
	public static void main(String[] args) {
		int x = 13;
		int y = 7;
		System.out.println("x = " + x + "\n" + "y = " + y);
		System.out.println("Среднее ариф. = " + (x + y) / 2);
		if (x > y) {
			System.out.println(x + " больше");
		} else if (x == y) {
			System.out.println(x + " и " + y + " равны");
		} else if (x < y) {
			System.out.println(y + " больше");
		}
	}

}
