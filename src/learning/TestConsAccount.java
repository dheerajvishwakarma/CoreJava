package learning;

public class TestConsAccount extends Exception {
	public static void main(String[] args) throws InsufficientBalance {

		ConsAccount A = new ConsAccount("9977673850", "Saving", 5002.0);
		System.out.println(A.getAccountType());
		System.out.println(A.getBalance());
		System.out.println(A.getNumber());
		
		A.withdrawl(1500);
		System.out.println(A.getBalance());
		

		/*
		 * try { if (A.getBalance() < 10000) { throw new InsufficientBalance(); } }
		 * catch (InsufficientBalance e) { // TODO: handle exception
		 * e.printStackTrace(); System.out.println("MY CUSOM MSG : EXCEPTION AAYA RE");
		 * }
		 */

		/*
		 * ConsAccount A1 = new ConsAccount(5000.0); auth(A1.getBalance());
		 * System.out.println(A1.getBalance());
		 * 
		 * }
		 */

	}

	private static void auth(double balance) throws InsufficientBalance {
		// TODO Auto-generated method stub
		if (balance < 5000) {
			throw new InsufficientBalance();

		}
	}

}
