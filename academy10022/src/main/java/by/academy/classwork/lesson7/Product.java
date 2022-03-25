package by.academy.classwork.lesson7;

public class Product {
	private String name;
	private double value;
	private int num;

	public Product() {

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=");
		builder.append(name);
		builder.append(", value=");
		builder.append(value);
		builder.append(", num=");
		builder.append(num);
		builder.append("]");
		return builder.toString();
	}

	public Product(String name, double value, int num) {
		super();
		this.name = name;
		this.value = value;
		this.num = num;
	}

	public void print() {
		System.out.println(name + value + num);
	}

	public void cost() {
		double cost = num * value;
		System.out.println(cost);
	}
}
