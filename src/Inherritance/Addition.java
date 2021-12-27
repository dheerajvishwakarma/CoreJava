package Inherritance;

public class Addition {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public double add(int a, double b) {
		System.out.println(a + b);
		return a + b;
	}

	public void add(float a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		add.add(4, 5.5);
		add.add(4, 4.5);
		add.add(5, 5);
		add.add(5, 10, 15);

	}

}
