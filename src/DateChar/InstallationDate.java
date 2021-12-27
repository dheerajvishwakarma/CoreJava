package DateChar;

import java.util.*;

public class InstallationDate {
	public static void main(String args[])
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("The installation Date is: " + cal.getTime());
		System.out.println("");
				
		for (int i = 1; i < 11; i++) {
			
			cal.add(Calendar.DATE, +30);
			System.out.println("The "+i+" Service date is : "+cal.getTime());
		}
		
	}
}


