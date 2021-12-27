package Interface;

public class Person1 {
	private String Firstname;
	private String Lastname;
	private String address;

	public Person1() {

		System.out.println("Default");
	}

	public Person1(String fn, String ln) {
		this();
		Firstname = fn;
		Lastname = ln;
		System.out.println("Person 2 Parameterised ");
		System.out.println("First Name:" + fn);
		System.out.println("last Name:" + ln);
	}

	public Person1(String fn, String ln, String add) {
		this(fn, ln);
		address = add;
		System.out.println("Person 3 Parameterised " + " " + fn + " " + ln + " " + add);

	}

	public static void main(String[] args) {
		Person1 p = new Person1("Rays", "Tech", "Indore");
		System.out.println();

	}
}
