package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Shorting {

	public static void main(String[] args) {
		List l = new ArrayList();

		l.add(5);
		l.add(4);
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(6);

		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}
}
