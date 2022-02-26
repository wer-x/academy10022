package by.academy.lesson1;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(1);
		Cat cat3 = new Cat(2, "xex");
		cat1.setAge(4);
		cat1.setNickname("Жора");

		cat1.grow(7);
		String sAnswer = cat1.getAge() <= 10 ? "Кот еще жив" : "Кот " + cat1.getNickname() + " мертв:(";
		System.out.println(sAnswer);
	}
}
