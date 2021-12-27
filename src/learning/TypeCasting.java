package learning;

public class TypeCasting {

	public static void main(String[] args) {

		int rupeeint = 50;
		System.out.println(Double.valueOf(rupeeint));

		System.out.println(Long.valueOf(rupeeint));

		long l = 50000000000l;
		System.out.println(Double.parseDouble("567"));
		System.out.println(Inte.parseInt("567"));
		System.out.println((int) l);

		// String from Any datatype : Parse method
		// Small to big : Value of
		// Big to small : Type conversion (int)l

	}

}
