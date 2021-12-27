package Inherritance;

//extends Shape
public class Circle extends Shape {
	private int radious;

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}

	public void area() {
		double area = 3.14 * radious * radious;
		System.out.println("Area of Circle" + area);
	}
}
