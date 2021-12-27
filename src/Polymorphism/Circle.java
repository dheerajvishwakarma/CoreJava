package Polymorphism;

//extends Shape
public class Circle extends Shape {
	private int radious;

	public Circle() {
	}

	public Circle(int r) {
		radious = r;
	}

	public int getRadious() {
		return radious;
	}

	public double area() {
		double area = 3.14 * radious * radious;
		System.out.println("Area of Circle" + area);
		return area;
	}
}
