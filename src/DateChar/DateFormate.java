package DateChar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateFormate {
	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date A = sdf.parse("05/12/1995");
		System.out.println(A);
	
		SimpleDateFormat Format1 = new SimpleDateFormat("dd.M.yy");
		String strDate = Format1.format(A);
		System.out.println("Format 1 :" + strDate);

		SimpleDateFormat Format2 = new SimpleDateFormat("MMM dd,yyyy");
		String Date = Format2.format(A);
		System.out.println("Format 2 :" + Date);

		SimpleDateFormat Format3 = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");
		String Date1 = Format3.format(d);
		System.out.println("Format 3 :" + Date1);
		
		
		 
	}
}
