package Thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NewEmployeeDeSerialisable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream file = new FileInputStream("C:\\\\Drive_E\\\\IO\\\\Serial.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		EmployeeSerialisable es = ( EmployeeSerialisable)in.readObject();
		
		System.out.println(es.getFirstname());
		System.out.println(es.getPassword()); // use transient password in main class  first to run input or read file then run output file
		

	}
}
