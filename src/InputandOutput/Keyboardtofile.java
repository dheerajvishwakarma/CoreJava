package InputandOutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Keyboardtofile {
	public static void main(String[] args) throws IOException {
		String target= "C:\\Drive_E\\test2.txt";
		FileWriter writer = new FileWriter(target);
		PrintWriter pw = new PrintWriter(writer);
		
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader in= new BufferedReader(isr);
		
		String line = in.readLine();
		while (!line.equals("quit")) {
			pw.println(line);
			line=in.readLine();
			
		}
		pw.close();
		writer.close();
	}

		
	}


