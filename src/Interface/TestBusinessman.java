package Interface;

public class TestBusinessman {
	public static void main(String[] args) {
		Richman r = new Businessman();
		r.earnMoney();
		r.donation();
		r.party();
		SocialWorker s = new Businessman();
		s.helpToOthers();
		Businessman b = new Businessman();
		b.earnMoney();
	}

}
