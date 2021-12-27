package Constructer;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape("red", 8);
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
	}

}
