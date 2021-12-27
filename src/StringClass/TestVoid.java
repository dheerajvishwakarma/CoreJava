package StringClass;

public class TestVoid {
	// Void by passing arguments
	// compile time arg.
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	public void substraction(int a, int b) {
		System.out.println(a - b);

	}

	public static void main(String[] args) {
		TestVoid v = new TestVoid();
		v.add(50, 100);
		v.substraction(20, 30);
	}

}
