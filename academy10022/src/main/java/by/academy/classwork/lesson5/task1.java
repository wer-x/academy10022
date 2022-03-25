package by.academy.classwork.lesson5;

public class task1 {

	public static void main(String[] args) {
		String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer";
		int temp = s.indexOf('S');
		int temp2 = 0;
		do {
			temp2 = s.indexOf('S', temp);
			if (temp2 == temp) {
				System.out.println(temp);
			}

		} while (temp++ < s.lastIndexOf('S'));
	}
}
