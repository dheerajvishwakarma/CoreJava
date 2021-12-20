package Rivision;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();

		s.setColor("Blue");
		s.setBorderWidth(10);

		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());

	}

}
