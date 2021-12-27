package DateChar;

import java.util.Date;
import java.util.Calendar;

public class DateArithmatic {
	public static void main(String[] args) {
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		cal.setTime(today);
		System.out.println(today);

		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dayOfYear);

		cal.add(Calendar.DATE, -1);
		Date yesterday = cal.getTime();
		System.out.println(yesterday);

		cal.add(Calendar.DATE, 30);
		Date nextEvent = cal.getTime();
		System.out.println(nextEvent);

	}

}
