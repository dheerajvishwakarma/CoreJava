package Polymorphism;

public class Shape {
	private int borderWidth;
	private String color;

	public Shape() {
	}

	public Shape(String s, int b) {
		color = s;
		borderWidth = b;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public String getColor() {
		return color;
	}

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
