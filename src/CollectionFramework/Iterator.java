package CollectionFramework;

import java.util.ArrayList;

public class Iterator {
	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();	
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
		java.util.Iterator it =l.iterator();
		
		while (it.hasNext()) {
			int object = (int) it.next();
			System.out.println(object);
			
		}
		
	}

}
