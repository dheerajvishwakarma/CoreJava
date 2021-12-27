package Assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat d = new SimpleDateFormat("dd/mm/yy");

		Person p = new Person();
		p.setName("Dheeru");
		p.setdob(d.parse("05/12/1994"));
		p.setAddress("Scheme no 71");
		// String c=p.getName();
		System.out.println(p);
		System.out.println(p.getName());
		System.out.println(p.getdob());
		System.out.println(p.getAddress());
	}

}
