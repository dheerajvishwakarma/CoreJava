package InputandOutput;

import java.io.File;

public class DirectoryList {
	public static void main(String[] args) {
		File directory = new File("C:\\Drive_D");

		File[] list = directory.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {

			}
			System.out.println((i + 1) + " " + ":" + list[i].getName());
		}

	}
}