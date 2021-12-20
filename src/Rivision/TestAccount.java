package Rivision;

public class TestAccount {
	public static void main(String[] args) {
		
		Account Account = new Account();
		Account.setNumber("23*********101");
		Account.setAccountType("SAVING");
		Account.setBalance(500000.00);
		
		System.out.println(Account.getNumber());
		System.out.println(Account.getAccountType());
		System.out.println(Account.getBalance());
		Account.withdrawl(5000);
		System.out.println("Withdrawl 5000 balance "+ Account.getBalance());
		Account.fontTransfer(15000);
		System.out.println("Fond Transfer 15000 balance  "+ Account.getBalance());
	}
}