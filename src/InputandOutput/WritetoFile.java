package InputandOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritetoFile {
	public static void main(String[] args) throws IOException {
		FileWriter writter = new FileWriter("C:\\Drive_E\\test.txt", true);// True for old data ramain,
		PrintWriter pw = new PrintWriter(writter);

		pw.println(":Line");
		pw.println("Dheeru");
		pw.println("Dheeru");

		pw.close();
		writter.close();
		System.out.println("Done");
	}
}
 