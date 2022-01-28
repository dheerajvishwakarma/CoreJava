package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Contestent {


	public String phone;
	public String name;

	public Contestent(String n, String p) {
		name = n;
		phone = p;
	}
		public static void main(String[] args) {
		ArrayList<Contestent> list = new ArrayList<Contestent>();
		list.add(new Contestent("Dheeru", "9977673850"));
		list.add(new Contestent("Vishu", "8602615473"));
		list.add(new Contestent("Manu", "8602615473"));
		list.add(new Contestent("Ayu", "9977673850"));
		list.add(new Contestent("Rachit", "1234567893"));
		list.add(new Contestent("Manyata", "860261473"));
		list.add(new Contestent("Yashika", "7123456789"));
		list.add(new Contestent("yash", "8602615473"));
		list.add(new Contestent("Tanmay", "8602615473"));
		list.add(new Contestent("Soumya", "9977673850"));
		list.add(new Contestent("Ruchika", "86015473"));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}
	}

