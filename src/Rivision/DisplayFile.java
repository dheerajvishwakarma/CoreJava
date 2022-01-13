package Rivision;

import java.io.File;

public class DisplayFile {
	public static void main(String[] args) {
		File directory = new File("C:\\Drive_E");
		String[]list= directory.list();
		for (int i = 0; i < list.length; i++) {
				System.out.println((i+1+":"+list[i]));
				
			}
			
			
		}
		
	}


