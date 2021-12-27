package Polymorphism;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape("red", 8);
		s.area();
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());

		Shape s1 = new Ractangle(25, 25);
		s1.area();

	}

}
