package learning;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String num) {
		number = num;
	}

	public static void main(String[] args) {
		Account ram = new Account();
		ram.setNumber("450");
		System.out.println(ram.getNumber());

		Account raju = new Account();
		raju.setNumber("451");
		System.out.println(raju.getNumber());
	}
}
