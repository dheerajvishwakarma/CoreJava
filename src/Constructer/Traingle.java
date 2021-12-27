package Constructer;

public class Traingle extends Shape {
	private int base;
	private int height;

	public Traingle() {
	}

	public Traingle(int b, int h) {
		base = b;
		height = h;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public void area() {
		double area = ((0.5) * (base * height));
		System.out.println("Area of Traingle: " + area);
	}

}
