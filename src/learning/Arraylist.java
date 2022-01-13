package learning;

import java.util.ArrayList;
import java.util.Vector;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList Ar = new ArrayList();
		Ar.add("One");
		Ar.add("Two");
		Ar.add("Three");
		System.out.println(Ar);
		Integer i = new Integer(5);
		Ar.add(i);

		Integer value = (Integer) Ar.get(3);
		System.out.println(value);

		Vector v = new Vector();
		v.add("One");
		v.add("Three");
		v.add("Two");
		v.add(4);
		System.out.println(v);
		Integer A = new Integer(5);
		v.add(i);
		System.out.println(v);

		int size = v.size();
		System.out.println(size);

	}

}
