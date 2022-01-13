package Rivision;

import java.io.File;

public class FileDisplayFolder {
	public static void main(String[] args) {
		File directory= new File("C:\\");
		File[]list= directory.listFiles();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
		}
	}

}
