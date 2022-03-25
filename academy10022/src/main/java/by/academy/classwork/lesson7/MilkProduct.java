package by.academy.classwork.lesson7;

public class MilkProduct extends Product {
	private double fat;
	private int age;
	final int DATEAGE = 10;

	public MilkProduct() {
		super();
		fat = 10;
		age = 10;

	}

	public MilkProduct(double fat, int age) {
		this.fat = fat;
		this.age = age;
	}

	public void print() {
		System.out.println(fat);
	}

	public void outOfDate() {
		if (age < DATEAGE) {
			System.out.println("nice");
		} else {
			System.out.println("not nice");
		}
	}

}
