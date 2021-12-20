package Rivision;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");

		p.setAddress("I N D O R E");
		p.setName("DHEERU_DJ");
		p.setDob(d.parse("05-12-1994"));
	

		System.out.println("NAME : " + p.getName());

		System.out.println("Address : " + p.getAddress());

		System.out.println("DOB : " + p.getDob());

	}

}
