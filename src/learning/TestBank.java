package learning;


public class TestBank {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		System.out.println(b.getBalance());
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(5, 10));
		System.out.println(calculator.multiply(5, 10));
	}
}
