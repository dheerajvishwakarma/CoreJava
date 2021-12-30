package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class isEmpty {
	public static void main(String[] args) {
		List l = new ArrayList<>();
		l.add(05);
		l.add("Dec");
		l.add('h');
		l.add(5.0);
		l.clear();

		System.out.println(l);
		System.out.println(l.isEmpty());

}
}