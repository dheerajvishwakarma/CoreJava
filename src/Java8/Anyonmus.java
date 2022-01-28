package Java8;

public class Anyonmus {
	public static void main(String[] args) {
		Richman r = new Richman() {

			@Override
			public void earnMoney() {
				System.out.println("EarnMoney");
				// TODO Auto-generated method stub

			}

			@Override
			public void donation() {
				// TODO Auto-generated method stub
				System.out.println("donation");
			}

			@Override
			public void party() {
				// TODO Auto-generated method stub
				System.out.println("Party");

			}
		};
		System.out.println("Donation");
		r.donation();
		r.earnMoney();
		r.party();
	}
}