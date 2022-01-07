package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheetComparatorPhysics {
	public static void main(String[] args) {
		

	Marksheet M1= new Marksheet();
	M1.setRollNo("3");
	M1.setFirstName("Yash");
	M1.setLastName("Vish");
	M1.setChemestry(68);
	M1.setPhysics(85);
	M1.setMaths(76);
	
	Marksheet M2= new Marksheet();
	M2.setRollNo("1");
	M2.setFirstName("Yashasvi");
	M2.setLastName("Sharms");
	M2.setChemestry(58);
	M2.setPhysics(35);
	M2.setMaths(46);
	
	
	Marksheet M3= new Marksheet();
	M3.setRollNo("4");
	M3.setFirstName("Yashi");
	M3.setLastName("Vaidh");
	M3.setChemestry(98);
	M3.setPhysics(96);
	M3.setMaths(99);
	
	Marksheet M4= new Marksheet();
	M4.setRollNo("2");
	M4.setFirstName("Supriya");
	M4.setLastName("Sharma");
	M4.setChemestry(99);
	M4.setPhysics(9);
	M4.setMaths(96);
	
	ArrayList l = new ArrayList ();
	
	l.add(M1);
	l.add(M2);
	l.add(M3);
	l.add(M4);
	
	Collections.sort(l, new MarksheetComparatorPhysics());
	java.util.Iterator it = l.iterator();
	
	while (it.hasNext()) {
		Marksheet m = (Marksheet) it.next();
		System.out.println(m.getRollNo()+" "+ m.getFirstName()+" "+m.getLastName()+" "+m.getPhysics()+" "+m.getChemestry()+" "+m.getMaths());
		

}
}}