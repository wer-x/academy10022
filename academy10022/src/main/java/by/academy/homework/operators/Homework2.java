package by.academy.homework.operators;

import java.io.IOException;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите тип");
		String st = scanner.next();
		// var x = scanner.next();
		switch (st) {
		case "int":
			System.out.println("Введите целое число");
			int i = scanner.nextInt();
			System.out.println(i % 2);
			break;
		case "double":
			System.out.println("Введите дробное число");
			double d = scanner.nextDouble();
			System.out.println(d * 0.7);
			break;
		case "float":
			System.out.println("Введите дробное число");
			float f = scanner.nextFloat();
			System.out.println(f * f);
			break;
		case "char":
			System.out.println("Введите символ");
			/*String str = scanner.next();
			char c = str.charAt(0);
			System.out.println(c);*/
			int c = System.in.read();
			System.out.println(c);
			break;
		case "string":
			System.out.println("Введите строку");
			String s = scanner.next();
			System.out.println("Hello " + s);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}
		scanner.close();

	}

}
