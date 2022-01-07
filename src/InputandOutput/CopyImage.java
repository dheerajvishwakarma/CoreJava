package InputandOutput;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyImage {


	public static void main(String[] args) throws IOException {
		
		String source ="C:\\Drive_E\\test.jpg";
		String target="C:\\Drive_E\\test1.jpg";
		
		FileReader reader = new FileReader(source);
		FileWriter writer= new FileWriter(target);
		
		int ch=reader.read();
		while (ch!=-1) {
			writer.write(ch);
			ch=reader.read();
			
			
		}
	writer.close();
	reader.close();
	System.out.println(source+"Copy to"+target);
	}

}


