package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class addAll {

	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(05);
		l.add("Dec");
		l.add('d');
		l.add(5.0);

		List l2 = new ArrayList<>();
		l2.add(10);
		l2.add("Dec");
		l2.add('j');
		l2.add(5.5);
		l.addAll(l2);
		System.out.println(l);
	}

}
