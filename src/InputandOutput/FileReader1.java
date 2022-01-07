package InputandOutput;

import java.io.*;

public class FileReader1 {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Drive_E\\test.txt");

		int ch = reader.read();
		char chr;

		while (ch != -1) {
			chr = (char) ch;
			System.out.println(chr);
			ch = reader.read();
		}
	}
}
