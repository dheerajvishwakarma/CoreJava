package InputandOutput;

import java.io.File;
import java.util.Date;

public class iO {
	public static void main(String[] args) {
		File F = new File("C:\\Drive_E\\test.txt");
		if (F.exists()) {
			System.out.println("Name : " + F.getName());
			System.out.println("Absolute Path : " + F.getAbsolutePath());
			System.out.println("Is Writable: " + F.canWrite());
			System.out.println("Is Readable: " + F.canRead());
			System.out.println("Is File: " + F.isFile());
			System.out.println("Is Directory: " + (F.isDirectory()));
			System.out.println("Last Modified at: " + new Date(F.lastModified()));
			System.out.println("Length: " + F.length());
		}

	}

}
