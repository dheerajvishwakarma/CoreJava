package StringClass;

public class Return {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Return t = new Return();
		int c = t.add(50, 100);
		System.out.println(c);
	}

}
