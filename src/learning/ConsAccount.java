package learning;

public class ConsAccount {

	private String Number;
	private String accountType;
	private double balance;
	
	public ConsAccount() {
		System.out.println("Default");
	}
	
	public ConsAccount(Double b) {
		balance=b;
	}
	public ConsAccount(String no,String Ac,Double b) {
		Number= no;
		accountType=Ac;
		balance=b;
		
		
				
	}


	/**
	 * @return the number
	 */
	public String getNumber() {
		return Number;
	}


	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public void withdrawl(int amt) throws InsufficientBalance {
		if(amt > balance) {
			System.out.println("1");
			throw new InsufficientBalance();
		}
		if(amt > 2000) {
			System.out.println("2");
			throw new InsufficientBalance();
		}
		this.balance = balance - amt;
		if(balance < 4000) {
			System.out.println("3");
			throw new InsufficientBalance();
		}
	}
}
