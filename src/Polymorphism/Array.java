package Polymorphism;

public class Array {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];

		s[0] = new Ractangle(5, 5);
		s[1] = new Circle(5);
		s[2] = new Traingle(10, 5);

		double arr = calArea(s);
		System.out.println(arr);

	}

	private static double calArea(Shape[] s) {
		// TODO Auto-generated method stub

		double ar = 0;
		for (int i = 0; i < s.length; i++) {
			ar += s[i].area();

		}
		return ar;
	}

}
