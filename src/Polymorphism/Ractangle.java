package Polymorphism;

public class Ractangle extends Shape {
	private int length;
	private int width;

	public Ractangle() {
	}

	public Ractangle(int l, int w) {
		length = l;
		width = w;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		double area = (length * width);
		System.out.println("Area " + area);
		return area;
	}

}
