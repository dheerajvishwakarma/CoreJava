package Assignments;

public class TestAccount {
	public static void main(String[] args) {

		TestAccount testAccount = new TestAccount();
		testAccount.ramAccountDetails();

	}

	public void ramAccountDetails() {
		Account ram = new Account();
		ram.setAccountType("Saving");
		ram.setBalance(5000);
		ram.setNumber("4");
		System.out.println(ram.getAccountType());
		System.out.println(ram.getBalance());
		System.out.println(ram.getNumber());
		ram.withdrawal(300);
		System.out.println(ram.getBalance());
		ram.deposit(1300);
		System.out.println(ram.getBalance());
	}
}
