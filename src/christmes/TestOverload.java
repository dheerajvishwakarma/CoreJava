package christmes;

public class TestOverload {

	public void test(String s) {
		System.out.println("String method call");
	}
	
	public void test(int i) {
		System.out.println("integer method call");
	}
	
	public void test(double d) {
		System.out.println("double method call");
	}
	
	
	public static void main(String[] args) {
		TestOverload o = new TestOverload();
		o.test(5);
	}
}
