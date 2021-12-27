package Abstract;

//extends Shape
public class Circle extends Shape {
	private int radious;

	public Circle(int r) {
		radious = r;
	}

	public int getRadious() {
		return radious;
	}

	@Override
	public double area() {
		double area = 3.14 * radious * radious;
		return area;
	}

}

