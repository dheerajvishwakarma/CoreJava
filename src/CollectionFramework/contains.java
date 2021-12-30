package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class contains {
	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(05);
		l.add("Dec");
		l.add('h');
		l.add(5.0);

		List l2 = new ArrayList<>();
		l2.add(05);
		l2.add("Dec");
		l2.add('h');
		l2.add(5.0);

		System.out.println(l.contains('h'));
		System.out.println(l2.contains('D'));
	}
}
