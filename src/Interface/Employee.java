package Interface;

public class Employee extends Person1 {
	private String designation;

	public Employee() {
		System.out.println("Default");
	}

	public Employee(String fn, String ln, String des) {
		super(fn, ln);
		designation = des;
		System.out.println("3 Parameterised" + " " + fn + " " + ln + " " + des);

	}

	public static void main(String[] args) {
		Employee e = new Employee("Dheeru", "Vish", "Developer");

	}
}
