package Array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateForm {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);

		// Convert date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
		String dt = sdf.format(d);
		System.out.println(dt);

		String s = "05/12/2021";
		Date dd = sdf.parse(s);
		System.out.println(dd);
	}

}
