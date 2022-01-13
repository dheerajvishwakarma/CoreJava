package Thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NewEmployeeSerialisable {
public static void main(String[] args) throws IOException, Exception {

		FileOutputStream file = new FileOutputStream("C:\\Drive_E\\IO\\Serial.txt");
		ObjectOutputStream in = new ObjectOutputStream(file);
		EmployeeSerialisable es = new EmployeeSerialisable();
	es.setFirstname("Dheeru");
	es.setLastname("Vish");
	es.setPassword("12345");
	
	in.writeObject(es);
	in.close();
	
		System.out.println("Done");
	}
}
