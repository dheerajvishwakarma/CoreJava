package ExceptionHandling;

public class TestAccount extends Exception {
	public static void main(String[] args) {

		Account Account = new Account();
		Account.setNumber("23*********101");
		Account.setAccountType("SAVING");
		Account.setBalance(500000.00);

		System.out.println("Account Number :" +Account.getNumber());
		System.out.println(Account.getAccountType());
		System.out.println(Account.getBalance());
		Account.withdrawl(5000);
		System.out.println("Withdrawl 5000 balance " + Account.getBalance());
		Account.fontTransfer(15000); 
		System.out.println("Fond Transfer 15000 balance  " + Account.getBalance());
		try {
			Account.setBalance(5050);
			Account.withdrawl(500);
			auth(Account.getBalance());
			System.out.println(Account.getBalance());
		} catch (InsufficientFund e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

	private static void auth(double balance) throws InsufficientFund {
		// TODO Auto-generated method stub
		if (balance < 5000) {
			InsufficientFund f = new InsufficientFund();
			throw f;

		}
	}
}