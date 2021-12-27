package Assignments;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public Account(String number, String accountType, double balance) {
		this.number = number;
		this.accountType = accountType;
		this.balance = balance;
	}

	public Account(String number, String accountType) {
		this.number = number;
		this.accountType = accountType;
	}

	public Account(String number) {
		this.number = number;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawal(double w) {
		balance = balance - w;
		System.out.println("Withdrawal from account is: " + w);
	}

	public void deposit(double d) {
		balance = balance + d;
		System.out.println("The deposit in this account is: " + d);
	}

}
