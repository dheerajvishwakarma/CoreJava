package DateChar;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class NewEmployeeAge {

	public static void main(String[] args) throws ParseException {

		// direct Age calculation

		LocalDate l = LocalDate.of(1995, 12, 05); // specify year,month,date. dob
		LocalDate now = LocalDate.now(); // get local date
		Period diff = Period.between(l, now);// Different calculation
		System.out.println(diff.getYears() + " " + "Years" + " " + diff.getMonths() + " " + "Months" + " "
				+ diff.getDays() + " " + "Days");
	}
}