package InputandOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLinebyLine {
public static void main(String[] args) throws IOException {
	FileReader Reader= new FileReader("C:\\Drive_E\\test.txt");
	BufferedReader br= new BufferedReader(Reader);
	 
	String line= br.readLine();
	while (line!=null) {
		System.out.println(line);
		line=br.readLine();
	
	}
	Reader.close();
	
}
}
