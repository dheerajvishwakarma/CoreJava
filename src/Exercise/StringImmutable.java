package Exercise;

final class StringImmutable {

	private final String brand;
	private final int makeYear;

	public StringImmutable(String b, int y) {
		brand = b;
		makeYear = y;

	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @return the makeYear
	 */
	public int getMakeYear() {
		return makeYear;
	}

	public static void main(String[] args) {
		StringImmutable s = new StringImmutable("Honda", 2022);
		System.out.println(s.brand);
		System.out.println(s.makeYear);
	}
}
