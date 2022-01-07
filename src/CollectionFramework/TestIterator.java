package CollectionFramework;

import java.util.Vector;

public class TestIterator {
public static void main(String[] args) {
	Vector v= new Vector();
	v.add("one");
	v.add("Two");
	v.add("Three");
	v.add("Four");
	v.add("Five");
	// Print all element by iterator
	java.util.Iterator it =  v.iterator();
	while (it.hasNext()) {
	it.remove();
	
	String str =(String) it.next();
	System.out.println(str);
		
	}
	
	
}
}
