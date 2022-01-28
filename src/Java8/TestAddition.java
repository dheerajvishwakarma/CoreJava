package Java8;

public class TestAddition {

	public static void main(String[] args) {
		FunctionalAddition h= (a,b)->{
			return a+b;
			
		};
		int c= h.add(5, 10);
		System.out.println(c);
		h.DefaultMethod();
		FunctionalAddition.staticMethod();
		
		
	}
}
