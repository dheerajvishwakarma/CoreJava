package InputandOutput;

import java.io.File;
import java.util.Iterator;

public class SubDirectoy {
	public static void main(String[] args) {
		File directory = new File( "C:\\");
		String[]list = directory.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println((i+1)+" "+":"+ list[i]);
			
			
		}
		
	}

}
