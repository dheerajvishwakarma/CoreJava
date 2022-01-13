package learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Iterator {
	public static void main(String[] args) {
		ArrayList a3 = new ArrayList();
		a3.add("String");
		a3.add("Boolean");
		a3.add("Integer");
		a3.add(1);
		System.out.println(a3);
		/*
		 * java.util.Iterator it= a.iterator(); while (it.hasNext()) { Object type =
		 * it.next(); System.out.println("Final result:" +type);
		 */
		java.util.Iterator it = a3.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		Set s = new TreeSet();
		s.add("123");
		s.add("system");

		System.out.println(s);
		java.util.Iterator it1 = s.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}
		HashMap m = new HashMap();
		m.put("125", 30);
		m.put("123", 35);
		System.out.println("M is:" + m);
		Integer i = (Integer) m.get("123");
		Set Keys = m.keySet();
		Collection values = m.values();
		System.out.println("Collection :" + values);
		System.out.println("Keys :" + Keys);
	}

}
