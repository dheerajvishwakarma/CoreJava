package Thread;

public class Account {
	private int balance = 0;

	public void deposit(String msg, int amt) {
		synchronized (this) {
			int bal = getBalance();
			setBalance(bal + amt);
		}
		System.out.println(msg + " " + getBalance());
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
