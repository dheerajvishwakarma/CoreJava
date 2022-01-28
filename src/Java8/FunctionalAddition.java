package Java8;

@FunctionalInterface
public interface FunctionalAddition {
	public int add(int a, int b);

	public default void DefaultMethod() {
		System.out.println("Test Default");
	}

	public static void staticMethod() {
		System.out.println("Test Static");
	}
}