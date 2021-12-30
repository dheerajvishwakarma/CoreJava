package ExceptionHandling;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	

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

	public void withdrawl(double w) {
		balance = balance - w;
	}

	public void deposit(double d) {
		balance = balance + d;

	}
	public void payBill(double p) {
		balance= balance-p;
	}
	public void fontTransfer(double f) {
		balance= balance-f;
	}


	}
		
	


